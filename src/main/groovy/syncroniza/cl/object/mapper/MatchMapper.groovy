package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import syncroniza.cl.object.model.Match
import syncroniza.cl.object.model.MatchDetail

@Mapper
interface MatchMapper {

    @Insert("""insert into match (field_name, date, total_amount) 
            values (#{field_name}, #{date}, #{total_amount})""")
    void create(@Param("field_name") String fieldName,
        @Param("date") String date,
        @Param("total_amount") int totalAmount)

    @Select("""select m.id, m.field_name, m.total_amount, m.date, 
            (select count(player_id) from match_player mp2 where mp2.match_id=mp.match_id) as total_players
            from match m inner join match_player mp on mp.match_id = m.id 
            group by mp.match_id
            offset #{offset} limit #{limit}""")
    List<MatchDetail> matchListWithNumberOfPlayers(@Param("offset") int offset, @Param("limit") int limit)

    @Select("select * from match where id = #{id}")
    Match getMatch(@Param("id") int id)

}

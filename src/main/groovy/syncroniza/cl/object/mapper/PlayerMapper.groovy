package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import syncroniza.cl.object.model.Player
import syncroniza.cl.object.model.PlayerDetail

@Mapper
interface PlayerMapper {

    @Insert("""insert into player (name, last_name, rut, email, phone) 
            values (#{name}, #{last_name}, #{rut}, #{email}, #{phone})""")
    void create(@Param("name") String name,
        @Param("last_name") String lastName,
        @Param("rut") String rut,
        @Param("email") String email,
        @Param("phone") String phone)

    @Select("""select p.*, sum(m.total_amount) as amount from player p join money m 
            on m.player_id= p.id group by player_id offset #{offset} limit #{limit}""")
    List<PlayerDetail> playerList(@Param("offset") int offset, @Param("limit") int limit)

    @Select("select * from player where id = #{id}")
    Player getPlayer(@Param("id") int id)

    @Select("""select p.* from match_player mp
            inner join player p on p.id = mp.player_id where mp.match_id = #{match_id}""")
    List<Player> matchPlayers(@Param("match_id") int match_id)

}
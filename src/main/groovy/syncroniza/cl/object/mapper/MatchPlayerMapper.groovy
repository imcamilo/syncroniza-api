package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface MatchPlayerMapper {

    @Insert("insert into match_player (id, player_id, match_id, paid, participation) values (#{id}, #{player_id}, #{match_id}, #{paid}, #{participation} )")
    void create(@Param("id,") int id,
        @Param("player_id") int playerId,
        @Param("match_id") int matchId,
        @Param("paid") boolean paid,
        @Param("participation") boolean participation)

}
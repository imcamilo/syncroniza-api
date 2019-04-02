package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface MoneyMapper {

    @Insert("insert into money (player_id, total_amount) values (#{player_id}, #{total_amount})")
    void add(@Param("player_id") int playerId, @Param("total_amount") int total_amount)

}
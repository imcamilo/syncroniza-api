package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import syncroniza.cl.object.model.Player

@Mapper
interface PlayerMapper {

    @Insert("insert into player (name, last_name, rut, email, phone) values (#{name}, #{last_name}, #{rut}, #{email}, #{phone})")
    void create(@Param("name") String name,
        @Param("last_name") String lastName,
        @Param("rut") String rut,
        @Param("email") String email,
        @Param("phone") String phone)

    @Select("select * from player offset #{offset} limit #{limit}")
    List<Player> playerList(@Param("offset") int offset, @Param("limit") int limit)

    @Select("select * from player where id = #{id}")
    Player getPlayer(@Param("id") int id)

}
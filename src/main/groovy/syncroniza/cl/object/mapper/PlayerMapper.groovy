package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface PlayerMapper {

    @Insert("insert into player (name, last_name, rut, email, phone) values (#{name}, #{last_name}, #{rut}, #{email}, #{phone})")
    void create(@Param("name") String name,
        @Param("last_name") String lastName,
        @Param("rut") String rut,
        @Param("email") String email,
        @Param("phone") String phone)

}
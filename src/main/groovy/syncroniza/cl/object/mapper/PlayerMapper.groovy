package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface PlayerMapper {

    @Insert("insert into users (id, name, lastName, rut, email, phone) values (#{id}, #{name}, #{lastName}, #{rut}, #{email}, #{phone} )")
    void create(@Param("id") Integer id,
        @Param("name") String name,
        @Param("lastName") String lastName,
        @Param("rut") String rut,
        @Param("email") String email,
        @Param("phone") String phone)

}
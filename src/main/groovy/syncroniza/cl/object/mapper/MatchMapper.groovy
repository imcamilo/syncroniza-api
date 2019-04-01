package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface MatchMapper {

    @Insert("insert into match (id, field_name, date, total_amount) values (#{id}, #{field_name}, #{date}, #{total_amount} )")
    void create(@Param("id") int id,
        @Param("field_name") String fieldName,
        @Param("date") String date,
        @Param("total_amount") int totalAmount)

}
package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface MatchMapper {

    @Insert("insert into match (field_name, date, total_amount) values (#{field_name}, #{date}, #{total_amount})")
    void create(@Param("field_name") String fieldName,
        @Param("date") String date,
        @Param("total_amount") int totalAmount)

    @Select("select * from match offset #{offset} limit #{limit}")
    def listMatchs(@Param("offset") int offset, @Param("limit") int limit)

}

package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import syncroniza.cl.object.model.Match

@Mapper
interface MatchMapper {

    @Insert("""insert into match (field_name, date, total_amount) 
            values (#{field_name}, #{date}, #{total_amount})""")
    void create(@Param("field_name") String fieldName,
        @Param("date") String date,
        @Param("total_amount") int totalAmount)

    @Select("select * from match offset #{offset} limit #{limit}")
    def matchList(@Param("offset") int offset, @Param("limit") int limit)

    @Select("select * from match where id = #{id}")
    Match getMatch(@Param("id") int id)

}

package syncroniza.cl.object.mapper

import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

@Mapper
interface MatchMapper {

    @Insert("insert into match (id, fieldName, date, totalAmount) values (#{id}, #{fieldName}, #{date}, #{totalAmount} )")
    void create(@Param("id") int id,
        @Param("fieldName") String fieldName,
        @Param("date") String date,
        @Param("totalAmount") int totalAmount)

}
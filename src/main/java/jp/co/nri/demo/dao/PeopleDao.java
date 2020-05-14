package jp.co.nri.demo.dao;

import jp.co.nri.demo.model.PeopleModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface PeopleDao {
    @Select("Select * from people")
    List<PeopleModel> select();
    @Select("Select * from people where id = #{id}")
    PeopleModel selectByID(int id);

}

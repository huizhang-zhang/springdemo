package cn.hui.cn.springdemo.dao;



import cn.hui.cn.springdemo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}

package cn.hui.cn.springdemo.service;



import cn.hui.cn.springdemo.dao.TestDao;
import cn.hui.cn.springdemo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}

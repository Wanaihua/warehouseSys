package com.dev.warehouse;

import com.dev.warehouse.sys.entity.User;
import com.dev.warehouse.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatisPlusApplicationTests {

    @Autowired(required=false)
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println(("----- selectAll method test -----------"));
        List<User> userList=userMapper.selectList(null);
        for (User user:userList){
            System.out.println(user);
        }
    }
}

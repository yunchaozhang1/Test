package com.example.mybatispluedemo.Test;

import com.example.mybatispluedemo.Mapper.UserMapper;
import com.example.mybatispluedemo.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 张雲超
 * @create 2020-01-08 18:30
 */

@SpringBootTest
@MapperScan("com.example.mybatispluedemo.Mapper")
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }}
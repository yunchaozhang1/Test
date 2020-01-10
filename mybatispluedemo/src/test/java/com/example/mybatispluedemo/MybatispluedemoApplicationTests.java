package com.example.mybatispluedemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatispluedemo.Mapper.UserMapper;


import com.example.mybatispluedemo.bean.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatispluedemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);

        //this.userMapper.insert(new User(8L,"Yun",20,"T@qq.com"));

       // this.userMapper.updateById(new User(8L,"Y",2,"Y@qq.com"));

         //   this.userMapper.selectList(new QueryWrapper<User>().eq("name","Billie")).forEach(System.out::println);
       // this.userMapper.deleteById(8L);

       // this.userMapper.selectBatchIds(Arrays.asList(1,2,3)).forEach(System.out::println);
        Page <User> page = this.userMapper.selectPage(new Page<>(2, 3), new QueryWrapper<User>());
        System.out.println(page.getTotal());
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        page.getRecords().forEach(System.out::println);
    }}
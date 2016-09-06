package com.hhzh.service;

import com.hhzh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 加载相关的spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testQueryUserById(){
        User user=userService.queryUserById(1);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("Lily");
        user.setAge(17);
        userService.saveUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(8);
        user.setName("Linda");
        user.setAge(18);
        userService.updateUser(user);
    }

    @Test
    public void testDeleteUserById() {
        userService.deleteUserById(8);
    }

}

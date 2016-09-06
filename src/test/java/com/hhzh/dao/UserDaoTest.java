package com.hhzh.dao;

import com.hhzh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和junit整合
 */
@RunWith(SpringJUnit4ClassRunner.class)
//加载spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testQueryUserById(){
        User user=userDao.queryUserById(1);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("Lily");
        user.setAge(17);
        userDao.saveUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(8);
        user.setName("Linda");
        user.setAge(18);
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUserById() {
        userDao.deleteUserById(8);
    }

}

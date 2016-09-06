package com.hhzh.service.impl;

import com.hhzh.dao.UserDao;
import com.hhzh.entity.User;
import com.hhzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service类是业务逻辑处理类，需要复杂的业务逻辑都是写在本类，
 * 本示例比较简单，没有复杂的业务逻辑操作，所以只简单调用了Dao接口，
 * 但是实际工作中本类必不可少。
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    /**
     * 当业务逻辑比较复杂的时候，需要在涉及增删改的方法上加上事务管理，
     * 本示例中只涉及一张表、一条数据的操作，其实不需要加事务。
     * 加事务用@Transactional注解
     * @param user
     */
    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}

package com.subbu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.subbu.dao.UserDao;
import com.subbu.model.Login;
import com.subbu.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}

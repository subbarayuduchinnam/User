package com.subbu.dao;

import com.subbu.model.Login;
import com.subbu.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}

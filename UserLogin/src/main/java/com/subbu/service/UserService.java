package com.subbu.service;

import com.subbu.model.Login;
import com.subbu.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}

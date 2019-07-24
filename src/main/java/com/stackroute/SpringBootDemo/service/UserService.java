package com.stackroute.SpringBootDemo.service;

import com.stackroute.SpringBootDemo.domain.User;

import java.util.List;

public interface UserService {

  public User saveUser(User user);

  public List<User> getAllUsers();
}

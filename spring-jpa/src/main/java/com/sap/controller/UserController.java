package com.sap.controller;

import com.sap.entity.User;
import com.sap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author i531869
 * @Date 2020/6/4 16:44
 * @Version 1.0
 */
@RestController
public class UserController {

  @Autowired
  UserRepository userRepository;

  @GetMapping("/usr/{id}")
  public User getUserById(@PathVariable("id") Integer id) {
    Optional<User> user = userRepository.findById(id);
    if (user.isPresent()){
      return user.get();
    }
    return null;
  }

  @PostMapping("/usr")
  public User insert(User user) {
    return userRepository.save(user);
  }
}

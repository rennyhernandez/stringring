package com.stringring.controllers;

import static org.slf4j.LoggerFactory.getLogger;

import com.stringring.domain.List;
import com.stringring.domain.User;
import com.stringring.domain.user.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by alexander on 28/05/16.
 */
@RestController
@EnableAutoConfiguration
public class UserService {
  Logger log = getLogger(UserService.class);

  @Autowired
  private UserRepository userRepository;

  @RequestMapping(value= "/user/{userId}", method = RequestMethod.GET,
  produces = "application/json")
  public User getUser(@PathVariable Long userId){
    return userRepository.findById(userId);
  }
  @RequestMapping(value="/user/{userId}", method = RequestMethod.PUT)
  public User updateUser(@PathVariable Long userId, @RequestBody User user){
    return userRepository.save(user);

  }

  @RequestMapping(value="/user", method = RequestMethod.POST)
  public User updateUser(@RequestBody User user){
    return userRepository.save(user);
  }
  @RequestMapping(value = "/user/{userId}/lists")
  public Set<List> getLists(@PathVariable Long userId){
      User user = userRepository.findById(userId);
      return user.getLists();
  }

  @RequestMapping(value = "/user/{userId}/list",
  method = RequestMethod.POST)
  public List createList(@PathVariable Long userId, @RequestBody List
      plist) {
    User user = userRepository.findById(userId);
    List list = new List();
    if (user != null) {
      list = user.createList(plist.getName(), plist.getDescription());
    }
    return list;

  }

}

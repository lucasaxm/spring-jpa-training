package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

/*    @RequestMapping("/sum/{a}/{b}")
    public int sum (@PathVariable int a, @PathVariable int b){
        return a+b;
    }*/

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/add/{name}/{password}")
    public String addUser(@PathVariable String name, @PathVariable String password){
        User user = new User(name,password);
        userRepository.saveAndFlush(user);
        return user.toString();
    }

//    public List<User>
}

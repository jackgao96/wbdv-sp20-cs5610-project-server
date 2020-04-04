package com.example.project.controllers;

import com.example.project.models.User;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping("/api/users")
    public List<User> findAllUsers(){
        return service.getAllUsers();
    }
    @GetMapping("/api/users/{uid}")
    public User findUserById(@PathVariable("uid") Integer uid){
        return service.findUserById(uid);
    }
    @PostMapping("/api/users")
    public User createUser(@RequestBody User user){
        return service.createUser(user);
    }
    @DeleteMapping("/api/users/{uid}")
    public int deleteUser(@PathVariable("uid") Integer uid){
        return service.deleteUser(uid);
    }
    @PutMapping("/api/users/{uid}")
    public int updateUser(@PathVariable("uid") Integer uid, @RequestBody User user){
        return service.updateUser(uid,user);
    }
}

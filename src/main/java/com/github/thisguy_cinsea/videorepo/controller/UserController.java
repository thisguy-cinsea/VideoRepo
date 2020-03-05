package com.github.thisguy_cinsea.videorepo.controller;

import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public List<User> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable (value = "id") Integer userId){
        return service.getById(userId);
    }

    @PostMapping("/")
    public User create(@Valid @RequestBody User user){
        return service.create(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable (value = "id") Integer userId,
                       @Valid @RequestBody User user){
        return service.update(userId, user);
    }

    @DeleteMapping("/{id}")
    public User delete(@PathVariable (value = "id") Integer userId){
        return service.delete(userId);
    }
}

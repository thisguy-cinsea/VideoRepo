package com.github.thisguy_cinsea.videorepo.controller;

import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.model.UserInterface;
import com.github.thisguy_cinsea.videorepo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController implements ControllerInterface<UserService, UserInterface, User> {

    @Autowired
    private UserService service;
    @Override
    public UserService getService() {
        return this.service;
    }
//
//    @Autowired
//    private UserService service;
//
//    @GetMapping("/")
//    public List<User> getAll(){
//        return service.getAll();
//    }
//
//    @GetMapping("/{id}")
//    public User getById(@PathVariable (value = "id") Integer userId){
//        return service.getById(userId);
//    }
//
    @PostMapping("/")
    public User create(@Valid @RequestBody User user){
        System.out.println("userController.create: " + user);
        return service.create(user);
    }

//    @PutMapping("/{id}")
//    public User update(@PathVariable (value = "id") Integer userId,
//                       @Valid @RequestBody User user){
//        return service.update(userId, user);
//    }
//
    @PostMapping("/login")
    public ResponseEntity<User> login(@Valid @RequestBody User user){
        System.out.println("userController.login");
        User foundUser = service.login(user);
        if (foundUser != null)
            return new ResponseEntity<>(foundUser, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
//
//    @DeleteMapping("/{id}")
//    public User delete(@PathVariable (value = "id") Integer userId){
//        return service.delete(userId);
//    }
}

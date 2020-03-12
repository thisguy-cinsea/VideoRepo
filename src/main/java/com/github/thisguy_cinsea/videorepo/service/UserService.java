package com.github.thisguy_cinsea.videorepo.service;

import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.model.UserInterface;
import com.github.thisguy_cinsea.videorepo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface<User>{

    @Autowired
    private UserRepository repository;
    @Override
    public UserRepository getRepository() {
        return this.repository;
    }

//    private UserRepository repository;
//
//
//    public UserService(UserRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<User> getAll() {
//        return repository.findAll();
//    }
//
//    public User getById(Integer userId) {
//        return repository.findById(userId).orElse(null);
//    }
//
//    public User create(User user) {
//        User newUser = new User();
//        newUser.setUserName(user.getUserName());
//        newUser.setPassword(user.getPassword());
//        return repository.save(newUser);
//    }
//
//    public User update(Integer userId, User user) {
//        User foundUser = getById(userId);
//        foundUser.setPassword(user.getPassword());
//        foundUser.setUserName(user.getUserName());
//        repository.save(foundUser);
//        return foundUser;
//    }
//
//    public User delete(Integer userId) {
//        User deletedUser = getById(userId);
//        repository.delete(deletedUser);
//        return deletedUser;
//    }
//
//    public User login(User user) {
//        User foundUser = repository.findByUserName(user.getUserName()).orElse(null);
//        System.out.println(foundUser);
//        if (foundUser.getPassword().equals(user.getPassword()))
//            return foundUser;
//        return null;
//    }
}

package com.github.thisguy_cinsea.videorepo.service;

import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.model.UserInterface;
import com.github.thisguy_cinsea.videorepo.repository.UserRepository;

public interface UserServiceInterface<SomeEntity extends UserInterface> extends ServiceInterface<UserRepository, UserInterface, User> {

    default SomeEntity login(SomeEntity entity) {
        SomeEntity foundEntity = (SomeEntity) getRepository().findByUserName(entity.getUserName()).orElse(null);
//        System.out.println(foundEntity);
//        System.out.println(entity);
        if (foundEntity != null)
            if (foundEntity.getPassword().equals(entity.getPassword()))
                return foundEntity;
        return null;
    }
}


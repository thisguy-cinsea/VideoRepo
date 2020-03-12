package com.github.thisguy_cinsea.videorepo.service;

import com.github.thisguy_cinsea.videorepo.model.EntityInterface;
import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceInterface<
        SomeRepository extends JpaRepository,
        SomeEntityInterface extends EntityInterface,
        SomeConcreteEntity extends SomeEntityInterface> {

    SomeRepository getRepository();

    default List<SomeEntityInterface> getAll() {
        return getRepository().findAll();
    }

    default SomeEntityInterface getById(Integer id) {
        return (SomeEntityInterface) getRepository().findById(id).orElse(null);
    }

//    default SomeEntityInterface create(SomeConcreteEntity entity) {
//        SomeEntityInterface newEntity = new SomeConcreteEntity();
//        newEntity.setUserName(entity.getUserName());
//        newEntity.setPassword(entity.getPassword());
//        return getRepository().save(newEntity);
//    }
//
//    default SomeEntityInterface update(Integer id, SomeConcreteEntity entity) {
//        SomeEntityInterface foundEntity = getById(id);
//        foundEntity.setPassword(entity.getPassword());
//        foundEntity.setUserName(entity.getUserName());
//        getRepository().save(foundEntity);
//        return foundEntity;
//    }
//
    default SomeEntityInterface delete(Integer id) {
        SomeEntityInterface deletedEntity = getById(id);
        getRepository().delete(deletedEntity);
        return deletedEntity;
    }
}

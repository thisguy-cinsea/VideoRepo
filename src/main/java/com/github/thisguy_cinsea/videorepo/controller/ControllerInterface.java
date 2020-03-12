package com.github.thisguy_cinsea.videorepo.controller;

import com.github.thisguy_cinsea.videorepo.model.EntityInterface;
import com.github.thisguy_cinsea.videorepo.model.User;
import com.github.thisguy_cinsea.videorepo.service.ServiceInterface;
import com.github.thisguy_cinsea.videorepo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public interface ControllerInterface<SomeService extends ServiceInterface,
        SomeEntityInterface extends EntityInterface,
        SomeConcreteEntity extends EntityInterface> {

    SomeService getService();

    @GetMapping("/")
    default List<SomeEntityInterface> getAll(){
        return getService().getAll();
    }

    @GetMapping("/{id}")
    default SomeEntityInterface getById(@PathVariable (value = "id") Integer id){
        return (SomeEntityInterface) getService().getById(id);
    }

//    @PostMapping("/")
//    default SomeEntityInterface create(@Valid @RequestBody SomeConcreteEntity entity){
//        return getService().create(entity);
//    }
//
//    @PutMapping("/{id}")
//    default SomeEntityInterface update(@PathVariable (value = "id") Integer id,
//                       @Valid @RequestBody SomeConcreteEntity entity){
//        return getService().update(id, entity);
//    }

    @DeleteMapping("/{id}")
    default SomeEntityInterface delete(@PathVariable (value = "id") Integer id){
        return (SomeEntityInterface) getService().delete(id);
    }
}

package com.github.thisguy_cinsea.videorepo.repository;

import com.github.thisguy_cinsea.videorepo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(nativeQuery = true, value = "SELECT * from user WHERE user_name = ?1")
    Optional<User> findByUserName(String userName);

}

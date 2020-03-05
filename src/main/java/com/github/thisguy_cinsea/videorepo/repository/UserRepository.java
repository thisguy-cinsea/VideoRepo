package com.github.thisguy_cinsea.videorepo.repository;

import com.github.thisguy_cinsea.videorepo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository<User,Integer> {
}


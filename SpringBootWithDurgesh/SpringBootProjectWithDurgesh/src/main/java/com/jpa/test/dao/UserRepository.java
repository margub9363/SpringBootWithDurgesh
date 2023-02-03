package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    public ArrayList<User> findByName(String name);

    public ArrayList<User> findByNameAndCity(String name, String city);
}


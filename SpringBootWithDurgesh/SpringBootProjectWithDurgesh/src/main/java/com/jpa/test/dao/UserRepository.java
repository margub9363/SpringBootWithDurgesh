package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    public ArrayList<User> findByName(String name);

    public ArrayList<User> findByNameAndCity(String name, String city);

    @Query("SELECT u from User u")
    List<User> getEveryUser();

    @Query("select u from User u where u.status=:n")
    List<User> getUserByStatus(@Param("n") String name);


}


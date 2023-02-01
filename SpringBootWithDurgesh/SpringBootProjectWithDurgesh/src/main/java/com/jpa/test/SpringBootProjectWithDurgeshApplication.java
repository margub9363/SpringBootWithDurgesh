package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Optional;

@SpringBootApplication
public class SpringBootProjectWithDurgeshApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootProjectWithDurgeshApplication.class, args);

        UserRepository userRepository =context.getBean(UserRepository.class);

        /*
        User user1 = new User();
        user1.setName("Rahman1");
        user1.setCity("Ranchi");
        user1.setStatus("Full Stack Developer");

        User user2 = new User();
        user2.setName("Rahman2");
        user2.setCity("Ranchi");
        user2.setStatus("Full Stack Developer");

        ArrayList<User> al = new ArrayList<User>();
        al.add(user1);
        al.add(user2);

        Iterable<User> savedUser = userRepository.saveAll(al);

        System.out.println("Below User got Saved:");
        for (User u : savedUser) {
            System.out.println(u);
        };

         */

//        updating  a user with User Id 1
        userRepository.findById(1);
        Optional<User> userWithId1 = userRepository.findById(1);
        System.out.println(userWithId1);
        userWithId1.get();
        System.out.println(userWithId1.get());
    }

}

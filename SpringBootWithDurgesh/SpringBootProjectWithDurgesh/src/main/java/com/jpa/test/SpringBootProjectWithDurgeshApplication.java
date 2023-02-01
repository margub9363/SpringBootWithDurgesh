package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectWithDurgeshApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootProjectWithDurgeshApplication.class, args);

        UserRepository userRepository =context.getBean(UserRepository.class);
        User user = new User();
        user.setName("Rahman");
        user.setCity("Ranchi");
        user.setStatus("Full Stack Developer");

        User user1 = userRepository.save(user);
        System.out.println(user1);
    }

}

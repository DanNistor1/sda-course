package com.sda.spring.mvc;

import com.sda.spring.mvc.config.AppInitializer;
import com.sda.spring.mvc.config.HibernateConfig;
import com.sda.spring.mvc.config.WebMvcConfig;
import com.sda.spring.mvc.model.User;
import com.sda.spring.mvc.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

// nefunctional
public class SpringMvcApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HibernateConfig.class);

        UserServiceImpl userService = context.getBean("userServiceImpl", UserServiceImpl.class);

        User user = new User();
        user.setName("jon snow");
        user.setEmail("jonsnow@gmail.com");

        userService.save(user);
    }
}

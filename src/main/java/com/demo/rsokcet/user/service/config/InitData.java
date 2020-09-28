package com.demo.rsokcet.user.service.config;

import com.demo.rsokcet.user.service.model.User;
import com.demo.rsokcet.user.service.model.dto.CreateUser;
import com.demo.rsokcet.user.service.repository.UserRepository;
import com.demo.rsokcet.user.service.service.UserService;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@AllArgsConstructor
public class InitData implements ApplicationRunner {
    private final UserRepository userRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Faker faker = new Faker();
        for (int i=0; i<10;i++){
            User user = new User();
            user.setId(faker.number().randomNumber());
            user.setMobile(faker.phoneNumber().cellPhone());
            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setJob(faker.job().position());
            userRepository.save(user);
        }


    }
}

package com.demo.rsokcet.user.service.service.impl;

import com.demo.rsokcet.user.service.model.User;
import com.demo.rsokcet.user.service.model.dto.CreateUser;
import com.demo.rsokcet.user.service.repository.UserRepository;
import com.demo.rsokcet.user.service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public Mono<User> create(CreateUser user) {
        return repository.save(new User(user));
    }

    @Override
    public Mono<User> update(User user) {
        return repository.save(user);
    }

    @Override
    public Flux<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<User> findOne(long id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Void> delete(long id) {
         return repository.deleteById(id);
    }
}

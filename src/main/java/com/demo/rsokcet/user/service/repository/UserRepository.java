package com.demo.rsokcet.user.service.repository;

import com.demo.rsokcet.user.service.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User,Long> {
}

package com.demo.rsokcet.user.service.model;

import com.demo.rsokcet.user.service.model.dto.CreateUser;
import lombok.*;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private long id;

    private String  firstName;

    private String  lastName;

    private String  mobile;

    private String  job;

    public User(CreateUser user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.mobile = user.getMobile();
        this.job = user.getJob();
    }
}

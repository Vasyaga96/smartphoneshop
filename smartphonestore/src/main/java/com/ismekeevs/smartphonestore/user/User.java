package com.ismekeevs.smartphonestore.user;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "/users")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    private String login;
    @Setter
    private String password;
}

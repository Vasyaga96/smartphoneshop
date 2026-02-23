package com.ismekeevs.smartphonestore.cart;

import com.ismekeevs.smartphonestore.smartphone.Smartphone;
import com.ismekeevs.smartphonestore.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "/carts")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    private Smartphone smartphone;
    @OneToOne
    private User user;

}

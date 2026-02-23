package com.ismekeevs.smartphonestore.smartphone;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "Smartphones")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Smartphone {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private BigDecimal price;
    private int stock;
    private int reserved;

}

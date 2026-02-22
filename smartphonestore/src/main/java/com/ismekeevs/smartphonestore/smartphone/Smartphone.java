package com.ismekeevs.smartphonestore.smartphone;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Smartphones")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Smartphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    private String brand;
    @Setter
    private String model;
    @Setter
    private BigDecimal price;
}

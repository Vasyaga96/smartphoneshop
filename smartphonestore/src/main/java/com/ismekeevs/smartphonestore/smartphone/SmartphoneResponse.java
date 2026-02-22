package com.ismekeevs.smartphonestore.smartphone;

import java.math.BigDecimal;

public record SmartphoneResponse(
        int id,
        String brand,
        String model,
        BigDecimal price
) {
    public static SmartphoneResponse fromEntity(Smartphone smartphone) {
        return new SmartphoneResponse(
                smartphone.getId(),
                smartphone.getBrand(),
                smartphone.getModel(),
                smartphone.getPrice()
        );
    }
}

package com.ismekeevs.smartphonestore.smartphone;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class SmartphoneService {
    private final SmartphoneRepository smartphoneRepository;
    //возврат активных смартфонов
    public Page<SmartphoneResponse> getSmartphones(
            String brand,
            String model,
            Integer minPrice,
            Integer maxPrice,
            Pageable pageable
    ) {
        return smartphoneRepository.findAvailableSmartphones(brand, model, minPrice, maxPrice, pageable).map(SmartphoneResponse::fromEntity);
    }
    //возврат одного смартфона
    public SmartphoneResponse getSmartphone(int id) {
        return smartphoneRepository.findById(id).map(SmartphoneResponse::fromEntity)
                .orElseThrow(() -> new RuntimeException("Smartphone is not available"));
    }

}

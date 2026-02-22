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

    public Page<SmartphoneResponse> getSmartphones(Pageable pageable) {
        return smartphoneRepository.findAll(pageable).map(SmartphoneResponse::fromEntity);
    }

    public SmartphoneResponse getSmartphone(Integer id) {
        Smartphone smartphone = smartphoneRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No such smartphone"));
        return SmartphoneResponse.fromEntity(smartphone);
    }

}

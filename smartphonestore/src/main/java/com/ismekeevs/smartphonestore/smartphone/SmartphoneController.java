package com.ismekeevs.smartphonestore.smartphone;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/smartphones")
@RequiredArgsConstructor
public class SmartphoneController {

    private final SmartphoneService smartphoneService;

    @GetMapping
    public ResponseEntity<Page<SmartphoneResponse>> getSmartphones(
            @RequestParam(required = false) String brand,
            Pageable pageable) {
        return ResponseEntity.ok(smartphoneService.getSmartphones(pageable));
    }


    @GetMapping("/{id}")
    public ResponseEntity<SmartphoneResponse> getSmartphone(@PathVariable int id) {
        return ResponseEntity.ok(smartphoneService.getSmartphone(id));
    }
}

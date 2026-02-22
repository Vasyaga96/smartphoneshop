package com.ismekeevs.smartphonestore.smartphone;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
    /*Page<Smartphone> findAllByCategory(Category category, Pageable pageable);*/
}

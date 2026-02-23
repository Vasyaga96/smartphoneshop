package com.ismekeevs.smartphonestore.smartphone;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
    /*Page<Smartphone> findAllByCategory(Category category, Pageable pageable);*/
    @Query("""
       SELECT s FROM Smartphone s
       WHERE s.stock > 0
       AND s.reserved < s.stock
       """)
    Page<Smartphone> findAvailableSmartphones(Pageable pageable);

}

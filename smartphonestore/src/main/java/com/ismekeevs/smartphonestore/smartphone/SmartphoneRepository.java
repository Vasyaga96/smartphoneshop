package com.ismekeevs.smartphonestore.smartphone;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
    //Метод для возврата активных смартфонов
    @Query("""
       SELECT s FROM Smartphone s
       WHERE s.stock > 0
       AND s.reserved < s.stock
       AND (:brand IS NULL OR s.brand = :brand)
       AND (:minPrice IS NULL OR s.price >= :minPrice)
       AND (:maxPrice IS NULL OR s.price <= :maxPrice)
       """)
    Page<Smartphone> findAvailableSmartphones(
            @Param("brand") String brand,
            @Param("model") String model,
            @Param("minPrice") Integer minPrice,
            @Param("maxPrice") Integer maxPrice,
            Pageable pageable
    );

}

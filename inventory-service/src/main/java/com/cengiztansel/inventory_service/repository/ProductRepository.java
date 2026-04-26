package com.cengiztansel.inventory_service.repository;

import com.cengiztansel.inventory_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // findAll, save, delete gibi metodlar otomatik gelir.
}

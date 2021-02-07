package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReository extends JpaRepository<Product,Long> {
}

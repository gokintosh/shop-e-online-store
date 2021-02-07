package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductReository extends JpaRepository<Product,Long> {

}

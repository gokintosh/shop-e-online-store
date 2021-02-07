package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.AddToCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddToCartRepository extends JpaRepository<AddToCart,Long> {
}

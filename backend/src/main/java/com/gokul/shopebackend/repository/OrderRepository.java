package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

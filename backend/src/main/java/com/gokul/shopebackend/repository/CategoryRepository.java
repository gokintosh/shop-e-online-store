package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

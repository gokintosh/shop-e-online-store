package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

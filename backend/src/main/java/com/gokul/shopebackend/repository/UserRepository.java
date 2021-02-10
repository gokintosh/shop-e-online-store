package com.gokul.shopebackend.repository;

import com.gokul.shopebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByMobile(String mobile);

}

package com.masingeitsolutions.ecommercebackend.Repository;

import com.masingeitsolutions.ecommercebackend.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);



}

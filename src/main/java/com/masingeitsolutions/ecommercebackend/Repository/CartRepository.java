package com.masingeitsolutions.ecommercebackend.Repository;

import com.masingeitsolutions.ecommercebackend.Domain.Cart;
import com.masingeitsolutions.ecommercebackend.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Optional<Cart> findbyUser(User user);
}

package com.masingeitsolutions.ecommercebackend.Repository;

import com.masingeitsolutions.ecommercebackend.Domain.Cart;
import com.masingeitsolutions.ecommercebackend.Domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    List<CartItem> findByCart(Cart cart);
}

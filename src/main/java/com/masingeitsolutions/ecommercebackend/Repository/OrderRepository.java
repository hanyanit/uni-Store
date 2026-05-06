package com.masingeitsolutions.ecommercebackend.Repository;

import com.masingeitsolutions.ecommercebackend.Domain.Order;
import com.masingeitsolutions.ecommercebackend.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUser(User user);

}

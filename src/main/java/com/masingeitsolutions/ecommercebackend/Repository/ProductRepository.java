package com.masingeitsolutions.ecommercebackend.Repository;

import com.masingeitsolutions.ecommercebackend.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

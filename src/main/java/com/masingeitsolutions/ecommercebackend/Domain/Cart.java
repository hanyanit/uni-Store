package com.masingeitsolutions.ecommercebackend.Domain;

import jakarta.persistence.*;

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors
    public Cart() {}

    public Cart(User user) {
        this.user = user;
    }

    public Long getCartId() { return cartId; }
    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }
}

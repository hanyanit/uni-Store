package com.masingeitsolutions.ecommercebackend.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private LocalDate orderDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    // Constructors
    public Order() {}

    public Order(User user, LocalDate orderDate, String status) {
        this.user = user;
        this.orderDate = orderDate;
        this.status = status;
    }

    // Getters & Setters
    public Long getOrderId() { return orderId; }
    public LocalDate getOrderDate() { return orderDate; }
    public String getStatus() { return status; }
    public User getUser() { return user; }
    public List<OrderItem> getOrderItems() { return orderItems; }

    public void setStatus(String status) { this.status = status; }
}

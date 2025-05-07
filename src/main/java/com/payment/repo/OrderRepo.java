package com.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

	Order findByRazorpayOrderId(String razorpayId);

}
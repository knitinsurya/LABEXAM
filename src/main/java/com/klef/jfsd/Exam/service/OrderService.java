package com.klef.jfsd.Exam.service;

import com.klef.jfsd.Exam.model.Order;
import com.klef.jfsd.Exam.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

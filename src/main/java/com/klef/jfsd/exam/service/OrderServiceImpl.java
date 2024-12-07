package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.pojo.Order;
import com.klef.jfsd.exam.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Override
	public String addOrder(Order o) {
		repository.save(o);
		return "Order Added Successfully";
	}

}

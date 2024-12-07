package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.pojo.Order;
import com.klef.jfsd.exam.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController 
{
	@Autowired
	private OrderService service;
	
	@PostMapping("add")
	public String addstudent(@RequestBody Order o)
	{
	  return service.addOrder(o);
	}
}

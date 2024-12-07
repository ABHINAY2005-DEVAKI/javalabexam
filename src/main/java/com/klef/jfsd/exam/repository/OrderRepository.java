package com.klef.jfsd.exam.repository;

import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.exam.pojo.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}

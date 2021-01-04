package com.elissandro.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elissandro.dsdeliver.dto.OrderDTO;
import com.elissandro.dsdeliver.entities.Order;
import com.elissandro.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	
	private OrderRepository repository;

	@Transactional(readOnly = true)	
	public List<OrderDTO> findAll(){
			List<Order> list = repository.findOrdersWithProducts();
			return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
			
		}
}

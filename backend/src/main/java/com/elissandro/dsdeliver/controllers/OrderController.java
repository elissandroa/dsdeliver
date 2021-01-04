package com.elissandro.dsdeliver.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.elissandro.dsdeliver.dto.OrderDTO;
import com.elissandro.dsdeliver.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService service;	
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findALL(){
		List<OrderDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<OrderDTO> insert(@RequestBody OrderDTO dto){
	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	.buildAndExpand(dto.getId()).toUri();
	dto = service.insert(dto);
	return ResponseEntity.created(uri).body(dto);
	}
}
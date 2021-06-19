package com.phase3.springboot.Phase3SpringBoot.rest;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phase3.springboot.Phase3SpringBoot.jdbc.entity.EProduct;

@Service
public interface RestDemoService {
	public List<EProduct> getProducts();
}

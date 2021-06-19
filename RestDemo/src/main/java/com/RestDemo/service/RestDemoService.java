package com.RestDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.RestDemo.entity.EProduct;

@Service
public interface RestDemoService {
	public List<EProduct> getProducts();
}

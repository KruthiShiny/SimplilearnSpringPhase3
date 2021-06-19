package com.phase3.springboot.Phase3SpringBoot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.springboot.Phase3SpringBoot.jdbc.dao.EProductDAO;
import com.phase3.springboot.Phase3SpringBoot.jdbc.entity.EProduct;

@Service
public class RestDemoServiceImpl implements RestDemoService {

	@Autowired
	EProductDAO eProductDAO;
	
	@Override
	public List<EProduct> getProducts() {
		return  eProductDAO.getProducts();
	}

}

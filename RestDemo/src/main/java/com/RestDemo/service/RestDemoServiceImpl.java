package com.RestDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestDemo.dao.EProductDAO;
import com.RestDemo.entity.EProduct;

@Service
public class RestDemoServiceImpl implements RestDemoService {

	@Autowired
	EProductDAO eProductDAO;

	public List<EProduct> getProducts() {
		return eProductDAO.getProducts();
	}

}

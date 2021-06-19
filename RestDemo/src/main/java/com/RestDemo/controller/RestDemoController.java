package com.RestDemo.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestDemo.entity.EProduct;
import com.RestDemo.service.RestDemoService;

@RestController
public class RestDemoController {

	@Autowired
	RestDemoService restDemoService;

	

	@GetMapping(value = "/getProducts")
	@ResponseBody
	public List<EProduct> listProducts() {
		List<EProduct> list = restDemoService.getProducts();
		return list;
	}

	@GetMapping(value = "/greeting")
	@ResponseBody
	public String greeting() {
		int a = 5 / 0;
		return "Hello world";
	}
	
	@GetMapping(value = "/greeting1")
	@ResponseBody
	public String greeting1() {
		if(true)
		throw new NullPointerException();
		
		return "Hello world";
	}

}

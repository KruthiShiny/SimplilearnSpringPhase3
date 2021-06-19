package com.phase3.springboot.Phase3SpringBoot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.phase3.springboot.Phase3SpringBoot.jdbc.entity.EProduct;

@RestController
public class RestDemoController {

	@Autowired
	RestDemoService restDemoService;

	@GetMapping(value = "/getProducts")
	@ResponseBody
	public List<EProduct> listProducts() {
		
		List<EProduct> list = restDemoService.getProducts();
		if(list.size()!=0) {
			throw new RuntimeException();
		}
		return list;
	}
	
}

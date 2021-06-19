package com.phase3.springboot.Phase3SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.phase3.springboot.Phase3SpringBoot.event.CustomEventPublisher;
import com.phase3.springboot.Phase3SpringBoot.event.WhatsAppEventPublisher;
import com.phase3.springboot.Phase3SpringBoot.jdbc.dao.EProductDAO;
import com.phase3.springboot.Phase3SpringBoot.jdbc.entity.EProduct;

@Controller
public class GreetingControllerMVC {

	@Autowired
	CustomEventPublisher publisher;
	
	@Autowired
	WhatsAppEventPublisher whatsAppEventPublisher;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {

		// All buiness logics
		// List<Students> Retrive list of students from DB
		//
		model.addAttribute("students", name);

		publisher.publish();
		// Call view
		return "hello"; // view
	}
	
	
	
	@ExceptionHandler(RuntimeException.class)
	@GetMapping("anil/update/status/")
	public String updateAnilStatus() {

		whatsAppEventPublisher.publish();
		// Call view
		return "hello"; // view
	}
	
	

	@Autowired
	EProductDAO eproductDAO;

	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(Model map) {
		List<EProduct> list = eproductDAO.getProducts();
		map.addAttribute("list", list);
		return "listProducts";
	}

}
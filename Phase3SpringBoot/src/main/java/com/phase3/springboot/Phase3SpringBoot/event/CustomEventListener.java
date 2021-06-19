package com.phase3.springboot.Phase3SpringBoot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener /*implements ApplicationListener<CustomEvent>*/ {

	@EventListener
	public void onApplicationEvent(CustomEvent event) {
		System.out.println("----------"+event.toString());
	}
	
	@EventListener
	public void onApplicationEvent1(CustomEvent event) {
		System.out.println("---------DD-"+event.toString());
	}
}

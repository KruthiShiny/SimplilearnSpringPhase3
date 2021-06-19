package com.phase3.springboot.Phase3SpringBoot.event;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
// @Component , @Controller, @Service, @Repository

@Component
public class AppEventHandler {

	@EventListener
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context Stopped Event Received===============");
	}
	
	@EventListener
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Started event Received===============");
	}
}

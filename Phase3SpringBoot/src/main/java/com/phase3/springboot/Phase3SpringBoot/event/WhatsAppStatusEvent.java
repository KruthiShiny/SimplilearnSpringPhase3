package com.phase3.springboot.Phase3SpringBoot.event;

import org.springframework.context.ApplicationEvent;



public class WhatsAppStatusEvent extends ApplicationEvent {

	public WhatsAppStatusEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "This is WhatsAppStatus Event";
	}
}

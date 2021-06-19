package com.phase3.springboot.Phase3SpringBoot.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppEventPublisher implements ApplicationEventPublisherAware {

	@Autowired
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void publish() {
		WhatsAppStatusEvent se = new WhatsAppStatusEvent(this);
		publisher.publishEvent(se);
		;
	}

	

}

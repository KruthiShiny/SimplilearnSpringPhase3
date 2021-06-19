package com.phase3.springboot.Phase3SpringBoot.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppStatusEventListener {

	@EventListener
	public void darakListeningMethod(WhatsAppStatusEvent event) {
		System.out.println("Darak gets notification");
	}

	@EventListener
	public void garuravListeningMethod(WhatsAppStatusEvent event) {
		System.out.println("Garuav gets notification");
	}

	@EventListener
	public void karthikListeningMethod(WhatsAppStatusEvent event) {
		System.out.println("Karthik gets notification");
	}
}

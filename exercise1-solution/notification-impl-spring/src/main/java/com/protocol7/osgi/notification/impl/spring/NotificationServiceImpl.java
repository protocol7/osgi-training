package com.protocol7.osgi.notification.impl.spring;

import com.protocol7.osgi.notification.api.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	public void notify(String user, String message) {
		System.out.println("Hey " + user + ": " + message);
		
	}

}

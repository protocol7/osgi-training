package com.protocol7.osgi.notification.impl;

import com.protocol7.osgi.notification.api.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	@Override
	public void notify(String user, String message) {
		System.out.println("Hey " + user + ": " + message);
		
	}

}

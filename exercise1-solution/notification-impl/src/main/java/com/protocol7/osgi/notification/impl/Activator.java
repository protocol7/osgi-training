package com.protocol7.osgi.notification.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.protocol7.osgi.notification.api.NotificationService;

public class Activator implements BundleActivator {

	@Override
	public void start(BundleContext context) {
		System.out.println("Starting implementation");
		context.registerService(NotificationService.class.getName(), new NotificationServiceImpl(), null);
		
		System.out.println("Starting implementation done");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping implementation");
		
	}

}

package com.protocol7.osgi.notification.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.protocol7.osgi.notification.api.NotificationService;

public class Activator implements BundleActivator {

	public void start(BundleContext context) {
		System.out.println("Starting consumer");
		ServiceReference reference = context.getServiceReference(NotificationService.class.getName());
		NotificationService notificationService = (NotificationService) context.getService(reference);
		
		notificationService.notify("Burt", "Hello world");
		
		System.out.println("Starting consumer done");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopping consumer");
		
	}

}

package com.paradox.vishal.introduction;

import com.paradox.vishal.introduction.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class IntroductionApplication implements CommandLineRunner {

	private final PaymentService paymentService;
	private final List<NotificationService> notificationServices;

	public IntroductionApplication(PaymentService paymentService,
								   List<NotificationService> notificationServices) {
		this.paymentService = paymentService;
		this.notificationServices = notificationServices;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentService.pay(100.0);
		notificationServices.forEach(service -> service.send("Payment processed successfully!"));
	}

}

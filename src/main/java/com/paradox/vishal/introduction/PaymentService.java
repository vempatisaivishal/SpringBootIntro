package com.paradox.vishal.introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @PostConstruct
    public void init() {
        System.out.println("PaymentService bean has been created and initialized!");
    }

    public void pay(double amount) {
        System.out.println("Processing payment of: $" + amount);
        System.out.println("Payment successful!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("PaymentService bean is about to be destroyed!");
    }

}

package com.coddingshuttle.pjo483.module1intro;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Paying......");
    }
    @PostConstruct
    public void AfterInit(){
        System.out.println("Before paying..");
    }
    @PreDestroy
    public void BeforeDest(){
        System.out.println("After Payment done..");
    }
}

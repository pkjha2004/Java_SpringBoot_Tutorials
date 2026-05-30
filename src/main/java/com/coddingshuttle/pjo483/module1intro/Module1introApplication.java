package com.coddingshuttle.pjo483.module1intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentServiceObj ;
	public static void main(String[] args) {
		SpringApplication.run(Module1introApplication.class, args);

	}


    @Override
    public void run(String... args) throws Exception {
        paymentServiceObj.pay();
    }
}

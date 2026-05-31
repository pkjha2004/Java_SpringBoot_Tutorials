package com.coddingshuttle.pjo483.module1intro;

import com.coddingshuttle.pjo483.module1intro.Impl.EmailNotificationServices;
import com.coddingshuttle.pjo483.module1intro.Impl.SMSNotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1introApplication implements CommandLineRunner {

    // FINAL CAN BE ADDED TO MAKE IT MORE MUTABLE AND HENCEWORTH MORE PREFERRED IN THE PRODUCTION
    // FINAL KEYWORD IS THE KEYWORD WHICH ENSURE THAT AFTER INITIALISATION IT CANT BE CHANGED


//    final NotificationServices notificationServicesObj;// Dependency Injection
//
//    public Module1introApplication( NotificationServices notificationServicesObj) {
//        this.notificationServicesObj = notificationServicesObj; // constructor dependency injection
//    }
    @Autowired
    Map<String, NotificationServices> notificationServicesMap = new HashMap<>();
    public static void main(String[] args) {
		SpringApplication.run(Module1introApplication.class, args);

	}


    @Override
    public void run(String... args) throws Exception {

//        notificationServicesObj.send("Hello");

        for(var notificationService: notificationServicesMap.entrySet()){
            System.out.println(notificationService.getKey());
            notificationService.getValue().send("Hello");
        }
    }
}

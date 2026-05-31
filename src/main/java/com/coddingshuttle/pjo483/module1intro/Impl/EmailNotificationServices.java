package com.coddingshuttle.pjo483.module1intro.Impl;

import com.coddingshuttle.pjo483.module1intro.NotificationServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Component
@Qualifier("EmailNotif")

//@ConditionalOnProperty(name = "notification.type", havingValue = "email" )
public class EmailNotificationServices implements NotificationServices {

    @Override
    public void send(String message) {
        System.out.println("Email Sending...." + message);
    }
}

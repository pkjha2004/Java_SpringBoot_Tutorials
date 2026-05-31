package com.coddingshuttle.pjo483.module1intro.Impl;

import com.coddingshuttle.pjo483.module1intro.NotificationServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("SMSNotif")
//@ConditionalOnProperty(name = "notification.type", havingValue = "sms")
public class SMSNotificationServices implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println("SMS sending...." + message);
    }
}

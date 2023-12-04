package com.example.mensajewhatsapptwilio.services;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

public class SentMesaje {
    // Find your Account Sid and Token at twilio.com/console
//    public static final String ACCOUNT_SID = "AC4789b1b961be1700024eb618b6482251";
//    public static final String AUTH_TOKEN = "8d2a68b5914d652b0adfba6e80947f1e";

//    public static void main(String[] args) {
//
//    }

    public SentMesaje() {
    }

    public static void MendarMensaje(String numeroEmpleado,String mensaje){

        String ACCOUNT_SID = "AC4789b1b961be1700024eb618b6482251";
        String AUTH_TOKEN = "8d2a68b5914d652b0adfba6e80947f1e";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+"+numeroEmpleado),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        mensaje)
                        .create();

//        System.out.println(message.getSid());
    }


    public static void main(String[] args) {
        MendarMensaje("59178777365","Prueba Jorge");
    }


}

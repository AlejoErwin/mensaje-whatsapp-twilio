package com.example.mensajewhatsapptwilio.services;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

public class SentMesaje {


    public SentMesaje() {
    }

    public static void MendarMensaje(String numeroEmpleado,String mensaje){

        String ACCOUNT_SID = "CODIGO";
        String AUTH_TOKEN = "CODIGO";
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+"+numeroEmpleado),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                        mensaje)
                        .create();

//        System.out.println(message.getSid());
    }


    public static void main(String[] args) {
        MendarMensaje("5917777777","Prueba Dato");
    }


}

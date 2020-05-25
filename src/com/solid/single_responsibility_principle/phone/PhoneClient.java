package com.solid.single_responsibility_principle.phone;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());

        phone.dial("0123456789");

        phone.send("Message text");

        phone.receive();

        phone.disconnect();
    }
}

package com.solid.single_responsibility_principle.phone;

public class ConnectionManagerImpl implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected");
    }
}

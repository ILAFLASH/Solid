package com.solid.single_responsibility_principle.phone;

public interface IConnectionManager {
    void dial(String phoneNumber);

    void disconnect();
}

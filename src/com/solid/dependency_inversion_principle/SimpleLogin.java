package com.solid.dependency_inversion_principle;

public class SimpleLogin implements Authenticator{

    //low level class

    public boolean authenticate(User user) {
        // logic - database
        return true;
    }
}

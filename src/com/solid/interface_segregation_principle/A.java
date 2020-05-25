package com.solid.interface_segregation_principle;

public class A {

    private I1 i1;

    public A(I1 i1) {
        this.i1 = i1;
    }

    public void callGetName() {
        i1.getName();
    }
}

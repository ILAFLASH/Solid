package com.solid.single_responsibility_principle.phone;

public class DataManagerImpl implements IDataManager {
    @Override
    public void send(String message) {
        System.out.println("Data send successfully");
    }

    @Override
    public int receive() {
        System.out.println("Data receive successfully");
        return 0;
    }
}
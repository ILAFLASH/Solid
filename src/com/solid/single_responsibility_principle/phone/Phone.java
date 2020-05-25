package com.solid.single_responsibility_principle.phone;

public class Phone implements IConnectionManager, IDataManager {

    private IConnectionManager connectionManager;
    private IDataManager dataManager;

    public Phone(IConnectionManager connectionManager, IDataManager dataManager) {
        this.connectionManager = connectionManager;
        this.dataManager = dataManager;
    }

    @Override
    public void dial(String phoneNumber) {
        connectionManager.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connectionManager.disconnect();
    }

    @Override
    public void send(String message) {
        dataManager.send(message);
    }

    @Override
    public int receive() {
        return dataManager.receive();
    }
}

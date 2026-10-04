package com.smarthome.bridge;

public abstract class SmartDevice {
    protected Connection connection;
    public SmartDevice(Connection connection) {
        this.connection = connection;
    }
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    public abstract void operate();
}


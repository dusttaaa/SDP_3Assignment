package com.smarthome.bridge;

public class SmartLight extends SmartDevice {
    public SmartLight(Connection connection){
        super(connection);
    }
    @Override
    public void operate() {
        connection.connect();
        System.out.println("Turning the smart light on");
    }
}

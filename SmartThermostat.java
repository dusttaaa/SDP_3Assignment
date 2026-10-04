package com.smarthome.bridge;

public class SmartThermostat extends SmartDevice {
    public SmartThermostat(Connection connection) {
        super(connection);
    }
    @Override
    public void operate() {
        connection.connect();
        System.out.println("Adjusting the temperature");
    }
}

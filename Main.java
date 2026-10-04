package com.smarthome.bridge;

public class Main {
    public static void main(String[] args) {
        Connection wifi = new WiFiConnection();
        Connection zigBee = new ZigBeeConnection();
        SmartLight smartLight = new SmartLight(wifi);
        SmartThermostat smartThermostat = new SmartThermostat(wifi);
        smartLight.operate();
        smartLight.setConnection(zigBee);
        smartLight.operate();
        smartThermostat.operate();
    }
}


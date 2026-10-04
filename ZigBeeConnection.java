package com.smarthome.bridge;

public class ZigBeeConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Zigbee Connection Started");
    }
}

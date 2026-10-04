package com.smarthome.bridge;

public class WiFiConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("WiFi Connection Started");
    }
}

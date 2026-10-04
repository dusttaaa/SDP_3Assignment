# Smart Home - Bridge Pattern

## Muratova Albina | SE-2511
## About the Project

This project is a simple example of the **Bridge Design Pattern** using a Smart Home system.
The main idea is to separate smart home devices from their connection types. A device can use different connections without changing the device itself.
For example, a `SmartLight` can work with WiFi and then switch to ZigBee at runtime.

## Project Structure

### Smart Devices

- `SmartDevice` - abstract base class.
- `SmartLight` - represents a smart light.
- `SmartThermostat` - represents a smart thermostat.

### Connections

- `Connection` - interface for connection types.
- `WiFiConnection` - WiFi implementation.
- `ZigBeeConnection` - ZigBee implementation.

`Main` is the client that demonstrates the pattern.

## How It Works

`SmartDevice` keeps a reference to the `Connection` interface:

```java
protected Connection connection;
```

This means the device doesn't depend on a specific connection.

For example:

```java
Connection wifi = new WiFiConnection();
SmartLight smartLight = new SmartLight(wifi);
```

The connection can also be changed at runtime:

```java
Connection zigBee = new ZigBeeConnection();
smartLight.setConnection(zigBee);
```

The same `SmartLight` object can now use ZigBee instead of WiFi.

## Example Output

```text
WiFi Connection Started
Turning the smart light on
Zigbee Connection Started
Turning the smart light on
WiFi Connection Started
Adjusting the temperature
```

## Bridge Pattern Roles

| Role | Class |
|---|---|
| Abstraction | `SmartDevice` |
| Refined Abstraction | `SmartLight` |
| Refined Abstraction | `SmartThermostat` |
| Implementor | `Connection` |
| Concrete Implementation | `WiFiConnection` |
| Concrete Implementation | `ZigBeeConnection` |
| Client | `Main` |

## Why Bridge?

Without Bridge, we could need separate classes for every device and connection combination:

```text
SmartLightWithWiFi
SmartLightWithZigBee
SmartThermostatWithWiFi
SmartThermostatWithZigBee
```

With the Bridge Pattern, devices and connections are separated. This makes it easier to add new devices or connection types without changing the existing classes.

## Conclusion

This project demonstrates how the Bridge Pattern separates smart devices from their connection methods and allows the connection to be changed at runtime.

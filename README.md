# Android Network Connectivity

A simple and lightweight Android utility to monitor network connectivity status in real-time.  
It detects when the device connects or disconnects from the internet (Wi-Fi, mobile data, Ethernet, etc.) and notifies via Toast messages.

## Features

- Real-time internet connectivity monitoring
- Supports multiple network types (Wi-Fi, Cellular, Ethernet)
- Easy to integrate into any Android project
- Minimal and clean Kotlin code

## How to Use

1. Add the necessary permission to your `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

Call checkNetwork function in MainActivity

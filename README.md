# 📶 Android Network Connectivity

A simple and lightweight Android utility to monitor **network connectivity status** in real-time.  
This utility uses a `BroadcastReceiver` to detect when the device connects or disconnects from the internet (Wi-Fi, mobile data, Ethernet, etc.) and notifies the user via **Toast messages**.

---

## ✨ Features

- 🔄 **Real-time connectivity monitoring**  
  Listens for network changes using a `BroadcastReceiver`.

- 🌐 **Supports multiple network types**  
  Detects Wi-Fi, Cellular, Ethernet, and more.

- 🧼 **Minimal and clean Kotlin code**  
  Written in Kotlin with simplicity and efficiency in mind.

- 🔌 **Easy integration**  
  Can be seamlessly integrated into any Android project.

---

## 📋 Requirements

- **Minimum Android Version:** API Level 21+ (Android 5.0 Lollipop and above)  
- **Permissions Required:**  
  ```xml
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

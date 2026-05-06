# 🌐 Java Networking: Real-Time Interactive System

A sophisticated implementation of the **TCP/IP stack** in Java, demonstrating real-time bidirectional data flow between independent processes using Sockets.

## 🚀 From Static to Interactive
This module showcases the evolution from a basic session counter to a fully functional **interactive messaging engine**. It proves the ability to handle live data streams and user-driven events.

### 🛠️ Key Technical Features
* **Modular Package Architecture**: The code is organized into a dedicated `interactive` package, following professional software design standards for separation of concerns.
* **Synchronized Data Streams**: 
    * The **Client** utilizes a `Scanner` linked to `System.in` to capture real-time keyboard input.
    * Data is transmitted instantly via a `PrintWriter` buffer across the network.
* **Persistent Server Logic**: The Server implements a continuous listening loop, processing multiple messages until a specific termination signal (`exit`) is received.
* **Robust Resource Management**: Advanced use of **Try-with-resources** blocks to ensure all network sockets and I/O streams are closed automatically, preventing memory leaks and port exhaustion.

[Image of Java socket programming interactive communication flow]

## 📊 System Components
1. **InteractiveServer**: A persistent background listener on port `11111` that processes and echoes client transmissions to the console.
2. **InteractiveClient**: A terminal-based user interface that enables live interaction with the remote server.

## 🧠 What I Learned
* How to synchronize input and output streams in a networked environment.
* Managing port connectivity and handling `IOException` in real-time.
* Implementing protocol-level termination signals for safe connection teardown.

---
*Professional Portfolio - Advanced Networking & Socket Programming.*

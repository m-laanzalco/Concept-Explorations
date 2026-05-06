# 🌐 Java Networking Basics

A fundamental implementation of the **Client-Server architecture** using Java Sockets.

## 🧠 Core Concepts
* **Socket Programming**: Established a stable TCP connection between two separate processes.
* **Server Lifecycle**: Implemented a persistent server that listens on a specific port (`11111`) and handles incoming requests in a loop.
* **Stream Handling**: Efficiently managed `BufferedReader` and `PrintWriter` to transmit data across the network.

## 🛠️ How it Works
1. **NetworkServer**: Listens for connections, assigns a session number to each client, and closes the individual connection after the message is sent.
2. **NetworkClient**: Connects to the local host, reads the data stream from the server, and prints the output until a termination signal is received.

---
*Professional Portfolio - Network Communications & Socket Management.*

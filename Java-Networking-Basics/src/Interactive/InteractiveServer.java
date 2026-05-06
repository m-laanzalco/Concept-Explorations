package interactive;

import java.io.*;
import java.net.*;

public class InteractiveServer
{
    public static void main(String[] args)
    {
        try (ServerSocket serverSocket = new ServerSocket(11111))
        {
            System.out.println("Server is listening on port 11111...");

            try (Socket socket = serverSocket.accept();
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

                System.out.println("Client connected!");
                String message;
                while ((message = in.readLine()) != null)
                {
                    System.out.println("Received from client: " + message);
                    if ("exit".equalsIgnoreCase(message))
                    {
                        break;
                    }
                }
            }
        } catch (IOException e)
          {
            System.err.println("Server Error: " + e.getMessage());
          }
    }
}
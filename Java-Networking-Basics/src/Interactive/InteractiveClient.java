package interactive;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class InteractiveClient
{
    public static void main(String[] args)
    {
        try (Socket socket = new Socket("localhost", 11111);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in))
        {

            System.out.println("Connected to Server. Type your message (type 'exit' to quit):");

            String userInput;
            while (true)
            {
                userInput = scanner.nextLine();
                out.println(userInput);
                if ("exit".equalsIgnoreCase(userInput))
                {
                    break;
                }
            }

        } catch (IOException e)
          {
            System.err.println("Client Error: " + e.getMessage());
          }
    }
}
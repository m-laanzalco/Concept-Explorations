import java.net.*;
import java.io.*;

public class NetworkServer
{
    public static void main(String[] args)
    {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        int counter = 1;

        try
        {
            serverSocket = new ServerSocket(11111);
            System.out.println("Server started. Waiting for connections...");

            while (true)
            {
                clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                out.println("Session number: " + counter);
                counter++;
                out.println("Stop");

                out.close();
                clientSocket.close();
            }
        } catch (Exception e)
          {
            System.err.println("Server error: " + e.getMessage());
          }
    }
}
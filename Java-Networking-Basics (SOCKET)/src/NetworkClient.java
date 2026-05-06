import java.net.*;
import java.io.*;

public class NetworkClient
{
    public static void main(String[] args)
    {
        Socket socket = null;
        try
        {
            socket = new Socket("localhost", 11111);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
                if (line.equals("Stop")) break;
            }

            reader.close();
            socket.close();
        } catch (UnknownHostException e)
          {
            System.err.println("Host unknown");
          } catch (Exception e)
          {
            System.err.println("Error: " + e.getMessage());
          }
    }
}
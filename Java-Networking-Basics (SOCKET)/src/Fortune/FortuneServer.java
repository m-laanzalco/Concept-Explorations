package fortune;

import java.io.*;
import java.net.*;
import java.util.Random;

public class FortuneServer
{
    public static void main(String[] args)
    {
        String[] fortunes =
                {
                        "Today is the perfect day to push your boundaries and your code.",
                        "A clean desk leads to clean code and a bug-free week.",
                        "Great opportunities come to those who document their logic.",
                        "The solution you seek is often hidden in the line you just skipped.",
                        "Your perseverance in debugging will soon lead to a breakthrough.",
                        "Simple logic is the key to solving complex problems."
                 };

        try (ServerSocket serverSocket = new ServerSocket(12345))
        {
            System.out.println("Fortune Server pronto sulla porta 12345...");
            while (true)
            {
                try (Socket socket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(socket.getOutputStream(), true))
                {

                    String randomFortune = fortunes[new Random().nextInt(fortunes.length)];
                    out.println("LA TUA FORTUNA DI OGGI: " + randomFortune);
                }
            }
        } catch (IOException e)
           {
            System.err.println("Errore Server: " + e.getMessage());
           }
    }
}
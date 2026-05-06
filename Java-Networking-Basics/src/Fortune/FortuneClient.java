package fortune;

import java.io.*;
import java.net.*;

public class FortuneClient
{
    public static void main(String[] args)
    {
        // Proviamo a connetterci al server sulla porta 12345
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())))
        {

            // Leggiamo la risposta del server
            String fortune = in.readLine();
            System.out.println("=== MESSAGGIO DAL SERVER ===");
            System.out.println(fortune);

        } catch (IOException e)
          {
            System.err.println("Errore di connessione: " + e.getMessage());
            System.err.println("Assicurati che FortuneServer sia avviato!");
          }
    }
}
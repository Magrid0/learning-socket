import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        // IP and Port of the socket.
        String host = "127.0.0.1";
        int port = 5000;

        try {
            Socket socket = new Socket(host, port); // Create the socket.
            System.out.println("Connected to server.");
        } catch (IOException e) {
            System.err.println("Client error:");
            e.printStackTrace();
        }
    }
}

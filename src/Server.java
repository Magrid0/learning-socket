import java.io.*;
import java.net.*;

public class Server {

    public static void startServer(int port) {
        // Start the socket and display some verbose.
        System.out.println("Starting server...");

        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server started.");

            Socket client = server.accept(); // Accept incoming connections.
            System.out.println("Client connected.");
        } catch (IOException e) {
            System.err.println("Server error:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // IP and Port of the socket.
        int port = 5000;

        // Start server socket.
        startServer(port);
    }
}

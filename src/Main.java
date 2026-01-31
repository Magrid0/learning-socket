import java.net.Socket;

public class Main {
    public static void main(String [] args) {
        // IP and Port of the socket.
        String host = "127.0.0.1";
        int port = 5000;

        Socket socket = new Socket(host, port); // Create the socket.
    }
}

package Sprint4.TCPDemoDistans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {


    String ip = "127.0.0.1";
    int port = 55555;

    //TODO:read from system.in, write to server
    public Client() throws IOException {

        try(Socket sock = new Socket(ip, port);
            BufferedReader readSytemIn = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader readServer = new BufferedReader(new InputStreamReader(sock.getInputStream()))){

            String fromSystemIn;
            String fromServer;
            while((fromSystemIn = readSytemIn.readLine()) != null) {
                write.println(fromSystemIn);

                fromServer = readServer.readLine();
                System.out.println(fromServer);

            }
        }

    }


    public static void main(String[] args) throws IOException {
        Client s = new Client();
    }

}

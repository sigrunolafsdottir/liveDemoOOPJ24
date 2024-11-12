package Sprint4.TCPDemoPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    int port = 55555;
    String ip = "127.0.0.1";

    public Client() throws IOException {

        try(Socket sock = new Socket(ip, port);
            PrintWriter toServer = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));){

            String temp;
            while((temp = fromUser.readLine()) != null) {

                toServer.println(temp);
                System.out.println("Sent to server "+temp);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        Client c = new Client();
    }
}

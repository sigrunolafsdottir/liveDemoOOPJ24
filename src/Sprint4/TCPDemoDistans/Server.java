package Sprint4.TCPDemoDistans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    String ip = "127.0.0.1";
    int port = 55555;

    //TODO: read from client, sout
    public Server() throws IOException {

        try(ServerSocket serv = new ServerSocket(port);
            Socket sock = serv.accept();
            PrintWriter write = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader buf = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            ){

            String temp;
            while((temp = buf.readLine()) != null) {
                System.out.println(temp);
                write.println("Du skrev: "+temp);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Server s = new Server();
    }


}

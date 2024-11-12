package Sprint4.TCPDemoPP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 55555;

    public Server() throws IOException {

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            BufferedReader fromClient = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));){

            String temp;
            while((temp = fromClient.readLine()) != null) {

                System.out.println(temp);

            }
        }
    }


    public static void main(String[] args) throws IOException{
        Server s = new Server();
    }
}

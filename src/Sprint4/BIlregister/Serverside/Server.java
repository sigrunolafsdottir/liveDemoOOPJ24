package Sprint4.BIlregister.Serverside;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    int port = 55555;
    DAO database = new DAO();

    public Server() throws IOException {

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader fromClient = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));){

            String question;
            String answer;

            out.println("Välkommen, skriv in ett regr:");

            while((question = fromClient.readLine()) != null) {

                answer = database.findCar(question);
                out.println(answer);
                out.println("Välkommen, skriv in ett regr:");
            }
        }
    }


    public static void main(String[] args) throws IOException{
        Server s = new Server();
    }

}

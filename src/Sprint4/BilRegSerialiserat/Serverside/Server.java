package Sprint4.BilRegSerialiserat.Serverside;

import Sprint4.BilRegSerialiserat.Models.Bil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    int port = 55555;
    DAO database = new DAO();

    public Server() throws IOException {

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader fromClient = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));){

            String question;
            Bil answer;

            out.writeObject("Välkommen, skriv in ett regr:");

            while((question = fromClient.readLine()) != null) {

                answer = database.findCarObject(question);
                if (answer != null) {
                    out.writeObject(answer);
                }
                else{
                    out.writeObject("Bilen kunde inte hittas");
                }
                out.writeObject("Välkommen, skriv in ett regr:");
            }
        }
    }


    public static void main(String[] args) throws IOException{
        Server s = new Server();
    }

}

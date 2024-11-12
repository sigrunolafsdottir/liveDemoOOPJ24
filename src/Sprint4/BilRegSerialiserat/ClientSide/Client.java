package Sprint4.BilRegSerialiserat.ClientSide;

import Sprint4.BilRegSerialiserat.Models.Bil;

import java.io.*;
import java.net.Socket;

public class Client {


    int port = 55555;
    String ip = "127.0.0.1";

    public Client() throws IOException, ClassNotFoundException {

        try(Socket sock = new Socket(ip, port);
            PrintWriter toServer = new PrintWriter(sock.getOutputStream(), true);
            ObjectInputStream fromServer = new ObjectInputStream(sock.getInputStream());
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));){

            String question;
            Object answer;
            String welcome;

            System.out.println(fromServer.readObject());  //läsa in "hej och välkommen"
            while((question = fromUser.readLine()) != null) {

                toServer.println(question);
                System.out.println("Sent to server "+question);

                answer = fromServer.readObject();
                if (answer instanceof Bil b) {
                    System.out.println(b);
                }
                else if (answer instanceof String s) {
                    System.out.println(s);
                }

                welcome = fromServer.readObject().toString();
                System.out.println(welcome);

            }

        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client c = new Client();
    }

}

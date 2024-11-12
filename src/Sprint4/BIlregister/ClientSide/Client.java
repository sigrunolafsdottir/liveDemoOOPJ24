package Sprint4.BIlregister.ClientSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {


    int port = 55555;
    String ip = "127.0.0.1";

    public Client() throws IOException {

        try(Socket sock = new Socket(ip, port);
            PrintWriter toServer = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));){

            String question;
            String answer;
            String welcome;

            System.out.println(fromServer.readLine());  //läsa in "hej och välkommen"
            while((question = fromUser.readLine()) != null) {

                toServer.println(question);
                System.out.println("Sent to server "+question);
                answer = fromServer.readLine();
                System.out.println(answer);

                welcome = fromServer.readLine();
                System.out.println(welcome);

            }

        }

    }

    public static void main(String[] args) throws IOException {
        Client c = new Client();
    }

}

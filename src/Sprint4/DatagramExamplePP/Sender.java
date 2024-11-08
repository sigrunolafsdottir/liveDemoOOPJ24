package Sprint4.DatagramExamplePP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {

    public Sender() throws IOException {

        //InetAddress adr = InetAddress.getLocalHost();
        InetAddress adr = InetAddress.getByName("127.0.0.1");
        int port = 55555;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket ds = new DatagramSocket();
        String mess;

        while((mess=br.readLine()) != null){
            DatagramPacket packet = new DatagramPacket(mess.getBytes(), mess.getBytes().length, adr, port );
            ds.send(packet);
        }
    }

    public static void main(String[] args) throws IOException {
        Sender s = new Sender();
    }
}

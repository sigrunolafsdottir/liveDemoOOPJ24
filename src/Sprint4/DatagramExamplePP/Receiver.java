package Sprint4.DatagramExamplePP;

import java.io.IOException;
import java.net.*;

public class Receiver {

    public Receiver() throws IOException {
        int port = 55555;
        DatagramSocket ds = new DatagramSocket(port);

        while(true) {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length );
            ds.receive(packet);

            String mess = new String(packet.getData(), 0, packet.getLength());
            System.out.println(mess);
        }


    }

    public static void main(String[] args) throws IOException {
        Receiver receiver = new Receiver();
    }
}

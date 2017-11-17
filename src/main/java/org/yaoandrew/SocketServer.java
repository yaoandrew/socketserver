package org.yaoandrew;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    public static void main (String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            while (true) {
                Socket client = server.accept();
                EchoHandler handler = new EchoHandler(client);
                handler.start();
            }
        } catch (Exception e) {
            System.err.println("Exeception :" + e);
        }
    }
}

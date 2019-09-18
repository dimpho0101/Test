package za.co.diputu.Router;

import java.io.*;
import java.net.*;

public class MarketConnection extends Thread {
    public static long id = 100001;
    String test = model.msgToBroker;
    public void run() {
        BrokerConnection ew = new BrokerConnection();
        ew.getMsgToMarket();
        try {
            System.out.println("Server on port 5001 has started");
            ServerSocket ss1 = new ServerSocket(5001);
            System.out.println("Server is waiting for za.co.diputu.Market request");
            Socket s1 = ss1.accept();
            System.out.println("Client is connected on za.co.diputu.Market");
            BufferedReader w = new BufferedReader(new InputStreamReader(s1.getInputStream()));
            String str1 = w.readLine();
            System.out.println( id + " Says: " + str1);
        } catch (Exception e ){}
    }
}
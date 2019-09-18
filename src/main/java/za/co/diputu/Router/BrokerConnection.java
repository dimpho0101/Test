package za.co.diputu.Router;

import java.io.*;
import java.net.*;

public class BrokerConnection {
    public static long id = 100000;
    private static String msgToMarket;

    public BrokerConnection(){}

    public String getMsgToMarket()
    {
        return msgToMarket;
    }

    public String setMsgToMarket(String marketMsg)
    {
        this.msgToMarket = marketMsg;
        return msgToMarket;
    }

    public void run() {
        try {


            System.out.println("Server on port 5000 has started");
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting for za.co.diputu.Broker request");
            Socket s = ss.accept();
            System.out.println("Client is connected on za.co.diputu.Broker");
            BufferedReader x = new BufferedReader(new InputStreamReader(s.getInputStream()));
            msgToMarket = x.readLine();
            System.out.println( id + " Says: " + msgToMarket);
        } catch (Exception e ) {}
         setMsgToMarket(msgToMarket);
        System.out.println(" A test: " + getMsgToMarket());
    }
}

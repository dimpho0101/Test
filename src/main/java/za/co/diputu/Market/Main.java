package za.co.diputu.Market;

import za.co.diputu.Router.*;

import java.io.*;
import java.net.*;

public class Main {
    public static int MarketPort = 5001;

    public static void main(String[] args) throws Exception {

        BrokerConnection ew = new BrokerConnection();

        Socket ss = new Socket(InetAddress.getByName("localhost"), MarketPort);
        String str = ew.getMsgToMarket();

        OutputStreamWriter os = new OutputStreamWriter(ss.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str);
        os.flush();

        System.out.println(str);
    }
}
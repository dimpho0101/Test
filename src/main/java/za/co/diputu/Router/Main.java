package za.co.diputu.Router;

import java.io.*;
import java.net.*;
import za.co.diputu.*;

public class Main {
    public static void main(String[] args) {

        BrokerConnection x = new BrokerConnection();
        MarketConnection m = new MarketConnection();
        x.run();
        m.run();
//        x.start();
//        m.start();
    }
}
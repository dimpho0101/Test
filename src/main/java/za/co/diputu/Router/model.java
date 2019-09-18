package za.co.diputu.Router;

public class model {
    public static String msgToBroker;
    private String msgToMarket;

    public String getMsgToBroker()
    {
        return msgToBroker;
    }

    public String getMsgToMarket()
    {
        return msgToMarket;
    }

    public  void setMsgToBroker(String newBroker)
    {
        this.msgToBroker = newBroker;
    }

    public void setMsgToMarket(String newMarket)
    {
        this.msgToMarket = newMarket;
    }
}

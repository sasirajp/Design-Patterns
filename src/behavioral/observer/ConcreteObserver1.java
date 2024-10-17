package behavioral.observer;

public class ConcreteObserver1 extends Observer {

    String clientName;

    public ConcreteObserver1(String clientName) {
        this.clientName = clientName;
    }

    @Override
    void update(StockData stockData) {
        System.out.println(this.clientName + " " + stockData.toString());
    }
}

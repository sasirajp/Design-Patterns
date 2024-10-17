package behavioral.observer;

public class ConcreteObserver2 extends Observer {

    String clientName;

    public ConcreteObserver2(String clientName) {
        this.clientName = clientName;
    }

    @Override
    void update(StockData stockData) {
        System.out.println(this.clientName + " " + stockData.toString());
    }
}

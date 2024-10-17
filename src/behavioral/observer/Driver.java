package behavioral.observer;

public class Driver {
    public static void main(String[] args) {
        Observer client1  = new ConcreteObserver1("Zerodha");
        Observer client2  = new ConcreteObserver1("Groww");
        Subject subject = new ConcreteSubject();
        subject.addObserver(client1);
        subject.addObserver(client2);


        var stockData = new StockData(10, 1, 2.3f);
        subject.notifyUsers(stockData);
    }
}

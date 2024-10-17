package behavioral.observer;

import java.util.List;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyUsers(StockData stockData);
}

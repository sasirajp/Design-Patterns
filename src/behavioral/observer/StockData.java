package behavioral.observer;

public class StockData {
    private float price;
    private int volume;
    private float marketCap;

    public StockData(float price, int volume, float marketCap) {
        this.price = price;
        this.volume = volume;
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "StockData{" +
                "price=" + price +
                ", volume=" + volume +
                ", marketCap=" + marketCap +
                '}';
    }
}

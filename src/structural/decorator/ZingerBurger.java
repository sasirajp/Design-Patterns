package structural.decorator;

public class ZingerBurger extends Burger {

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public Integer getPrice() {
        return 120;
    }

}

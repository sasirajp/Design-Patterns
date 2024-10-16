package structural.decorator;

public class ExtraMayo extends BurgerDecorator {

    private final Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Mayo";
    }

    @Override
    public Integer getPrice() {
        return burger.getPrice() + 20;
    }
}

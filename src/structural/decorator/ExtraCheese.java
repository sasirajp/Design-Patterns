package structural.decorator;

public class ExtraCheese extends BurgerDecorator {
    private final Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " with Extra cheese";
    }

    @Override
    public Integer getPrice() {
        return burger.getPrice() + 25;
    }
}

package structural.decorator;

public class Driver {
    public static void main(String[] args) {
        Burger burger = new PannerTikkaBurger();
        System.out.printf("%s - %s%n", burger.getDescription(), burger.getPrice());

        burger = new ExtraCheese(burger);
        System.out.printf("%s - %s%n", burger.getDescription(), burger.getPrice());
    }
}

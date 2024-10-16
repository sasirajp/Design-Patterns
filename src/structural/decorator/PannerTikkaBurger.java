package structural.decorator;

public class PannerTikkaBurger extends Burger {

    @Override
    public String getDescription() {
        return "Panner Tikka burger";
    }

    @Override
    public Integer getPrice() {
        return 100;
    }
}

package creational.factory_pattern;


// Limitation in Factory method is that we only have one product(Shape).
// Abstract Factory is for family of related products(Button, CheckBox)
// we can add new factories of existing products like high contrast button/checkbox
// Limitation/Trade off: hard to add new product

// Note: I argued that why can't just use builder we can add whatever we want
// with builder we loose consistency. in abstract factory we get one factory and fetch those family product.
// like lightTheme factory will only fetch me light gui elements.

public class C_AbstractFactoryMethodPatternDriver {
    public static void main(String[] args) {
        GUIFactory guiFactory = new DarkThemeFactory();
        Button button = guiFactory.getButton();
        button.renderButton();
    }
}

interface Button {
    void renderButton();
}

interface CheckBox {
    void renderCheckBox();
}

class LightThemeButton implements Button {

    @Override
    public void renderButton() {
        System.out.println("render light button");
    }
}

class LightThemeCheckBox implements CheckBox {

    @Override
    public void renderCheckBox() {
        System.out.println("light check box");
    }
}

class DarkThemeButton implements Button {

    @Override
    public void renderButton() {
        System.out.println("Dark button");
    }
}

class DarkThemeCheckBox implements CheckBox {

    @Override
    public void renderCheckBox() {
        System.out.println("Dark check box");
    }
}


interface GUIFactory {
    Button getButton();
    CheckBox getCheckBox();
}

class LightThemeFactory implements GUIFactory {

    @Override
    public Button getButton() {
        return new LightThemeButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new LightThemeCheckBox();
    }
}

class DarkThemeFactory implements GUIFactory {

    @Override
    public Button getButton() {
        return new DarkThemeButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new DarkThemeCheckBox();
    }
}


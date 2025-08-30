package practice.factory;



public class AbstractFactoryPractice {
    public static void main(String[] args) {
        GUIFactory factory = new DarkThemeFactory();
        Button button = factory.createButton();
        button.printButton();
    }
}


interface Button {
    void printButton();
}

interface CheckBox {
    void printCheckBox();
}

class LightButton implements Button {

    @Override
    public void printButton() {
        System.out.println("Light button");
    }
}

class LightCheckBox implements CheckBox {

    @Override
    public void printCheckBox() {
        System.out.println("Light CheckBox");
    }
}

class DarkButton implements Button {

    @Override
    public void printButton() {
        System.out.println("Dark Button");
    }
}

class DarkCheckBox implements CheckBox {

    @Override
    public void printCheckBox() {
        System.out.println("Dark checkbox");
    }
}

interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}

class LightThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}

class DarkThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}


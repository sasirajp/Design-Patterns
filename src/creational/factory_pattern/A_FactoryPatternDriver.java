package creational.factory_pattern;


// Limitation in this is that we cannot add a new shap like parallelogram in this
// code without modifying existing code, which violates OCP rule.(need to modify factory class)


public class A_FactoryPatternDriver {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.printShapeType();
    }
}

interface Shape {
    void printShapeType();
}

class Circle implements Shape {

    @Override
    public void printShapeType() {
        System.out.println("circle");
    }
}

class Square implements Shape {

    @Override
    public void printShapeType() {
        System.out.println("square");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type == "circle") return new Circle();
        else if (type == "sqaure") return new Square();
        else return null;
    }
}



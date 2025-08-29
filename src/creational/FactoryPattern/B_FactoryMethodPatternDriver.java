package creational.FactoryPattern;

public class B_FactoryMethodPatternDriver {
    public static void main(String[] args) {
        ShapeFactory1 factory1 = new CircleFactory();
        Shape1 shape1 = factory1.getShape();
        shape1.printShapeType();
    }
}

interface Shape1 {
    void printShapeType();
}

class Circle1 implements Shape1 {

    @Override
    public void printShapeType() {
        System.out.println("circle");
    }
}

class Square1 implements Shape1 {

    @Override
    public void printShapeType() {
        System.out.println("square");
    }
}

interface ShapeFactory1 {
    Shape1 getShape();
}

class CircleFactory implements ShapeFactory1 {

    @Override
    public Shape1 getShape() {
        return new Circle1();
    }
}

class SquareFactory implements ShapeFactory1 {

    @Override
    public Shape1 getShape() {
        return new Square1();
    }
}
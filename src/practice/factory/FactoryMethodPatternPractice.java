package practice.factory;

public class FactoryMethodPatternPractice {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        Shape circle = shapeFactory.createShape();
        circle.printShape();
    }
}

interface Shape {
    void printShape();
}

class Circle implements Shape {

    @Override
    public void printShape() {
        System.out.println("circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void printShape() {
        System.out.println("Rectangle");
    }
}


interface ShapeFactory {
    Shape createShape();
}

class CircleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}


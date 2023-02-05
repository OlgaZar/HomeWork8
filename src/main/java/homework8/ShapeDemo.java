package homework8;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape figure1 = new Circle();
        Shape figure2 = new Triangle();
        Shape figure3 = new Oval();
        Shape figure4 = new Rhombus();
        Shape figure5 = new Quad();
        new ShapeTest().takeShapeAndOutputName(figure1);
        new ShapeTest().takeShapeAndOutputName(figure2);
        new ShapeTest().takeShapeAndOutputName(figure3);
        new ShapeTest().takeShapeAndOutputName(figure4);
        new ShapeTest().takeShapeAndOutputName(figure5);

    }
}

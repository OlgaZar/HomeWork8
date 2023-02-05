package homework8;

public class Circle extends Shape implements Drawable {

    public Circle() {
        this.figureName = "circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}

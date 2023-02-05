package homework8;

public class Quad extends Shape implements Drawable {

    public Quad () {
        this.figureName = "quad";
    }

    @Override
    public void draw() {
        System.out.println("Quad is drawn");
    }
}

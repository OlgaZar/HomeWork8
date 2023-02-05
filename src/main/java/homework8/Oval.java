package homework8;

public class Oval extends Shape implements Drawable {

    public Oval () {
        this.figureName = "oval";
    }

    @Override
    public void draw() {
        System.out.println("Oval is drawn");
    }
}

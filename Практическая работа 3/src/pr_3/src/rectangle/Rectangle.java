package pr_3.src.rectangle;
import pr_3.src.shape.*;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(){
        this.width = 2.0;
        this.lenght = 1.0;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle (double width, double lenght){
        this.width = width;
        this.lenght = lenght;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle (double width, double lenght, String color, boolean filled){
        this.width = width;
        this.lenght = lenght;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+lenght);
    }

    @Override
    public String toString(){
        return "Shape: rectangle, width: "+this.width+", lenght: "+this.lenght+", color: "+this.color;
    }
}

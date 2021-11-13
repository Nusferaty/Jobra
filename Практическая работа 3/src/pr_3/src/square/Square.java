package pr_3.src.square;
import pr_3.src.rectangle.*;

public class Square extends Rectangle{
    protected double side;

    public Square (){
        this.side = 3;
        this.color = "blue";
        this.filled = false;
    }

    public Square (double side){
        this.side = side;
        this.color = "blue";
        this.filled = false;
    }

    public Square (double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString(){
        return "Rectangle: square, side: "+this.side+", color: "+this.color;
    }
}

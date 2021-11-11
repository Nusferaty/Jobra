package jaava.src.ball;

public class Ball {
    private String color;
    private int size;

    public Ball(String c, int s){
        color = c;
        size = s;
    }
    public Ball(String c){
        color = c;
        size = 2;
    }
    public Ball(){
        color = "Blue";
        size = 0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        return " This ball is "+this.color+", size "+this.size;
    }
}

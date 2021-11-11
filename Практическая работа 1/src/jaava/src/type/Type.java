import jaava.src.ball.*;

public class Type {
    public static void main(String[] args){
        Ball b1 = new Ball("red", 4);
        Ball b2 = new Ball("colorful", 10);
        Ball b3 = new Ball("green");
        b3.setSize(2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
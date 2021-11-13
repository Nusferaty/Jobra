package pr_3.src.z2.movablePoint;
import pr_3.src.z2.movable.Movable;

public class MovablePoint implements Movable {

    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return "Movable point: ";
    }

    @Override
    public void moveUp() {
        System.out.println(x += xSpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(x -= xSpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(y -= ySpeed);
    }

    @Override
    public void moveRight() {
        System.out.println(y += ySpeed);
    }
}
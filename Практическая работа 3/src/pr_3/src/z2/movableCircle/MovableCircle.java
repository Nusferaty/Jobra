package pr_3.src.z2.movableCircle;
import pr_3.src.z2.movable.*;
import pr_3.src.z2.movablePoint.*;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return "Movable circle: ";
    }

    @Override
    public void moveUp() {
        System.out.println(center.x += center.xSpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(center.x -= center.xSpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(center.y -= center.ySpeed);
    }

    @Override
    public void moveRight() {
        System.out.println(center.y += center.ySpeed);
    }
}

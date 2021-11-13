package pr_3.src.z2.movableRectangle;
import pr_3.src.z2.movable.Movable;
import pr_3.src.z2.movablePoint.*;

public class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            topLeft     = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        public String toString(){
            return "Movable rectangle: ";
        }

        @Override
        public void moveUp() {
            System.out.println(topLeft.y -= topLeft.ySpeed);
            System.out.println(bottomRight.y -= topLeft.ySpeed);
        }

        @Override
        public void moveDown() {
            System.out.println(topLeft.y += topLeft.ySpeed);
            System.out.println(bottomRight.y += topLeft.ySpeed);
        }

        @Override
        public void moveRight() {
            System.out.println(topLeft.x += topLeft.xSpeed);
            System.out.println(bottomRight.x += topLeft.xSpeed);
        }

        @Override
        public void moveLeft() {
            System.out.println(topLeft.x -= topLeft.xSpeed);
            System.out.println(bottomRight.x -= topLeft.xSpeed);
        }
}

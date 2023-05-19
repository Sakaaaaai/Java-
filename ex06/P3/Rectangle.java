import java.lang.Math;

class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2) {
        super(p1, new Point(p2.x, p1.y), p2.x - p1.x);
    }
}
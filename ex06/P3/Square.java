import java.lang.Math;

class Square extends Rectangle {
    public Square(Point p, int width) {
        super(p, new Point(p.x + width, p.y + width));
    }
}
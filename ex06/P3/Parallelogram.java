import java.lang.Math;

class Parallelogram extends Quadrangle {
    protected int width;
    
    public Parallelogram(Point p1, Point p2, int width) {
        super(p1, new Point(p1.x + width, p1.y), new Point(p2.x + width, p2.y), new Point(p2.x, p2.y));
        this.width = width;
    }
    
}
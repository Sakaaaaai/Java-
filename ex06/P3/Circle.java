import java.lang.Math;

class Circle extends Shape {
    protected Point center;
    protected int radius;
    
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public void print() {
        super.print();
        System.out.println("(" + center.x + ", " + center.y + ") radius = " + radius);
    }
    
    public void move(int dx, int dy) {
        center.x += dx;
        center.y += dy;
    }
}
public class MovingPoint {
    int x = 0;
    int y = 0;
    int vx = 0;
    int vy = 0;

    public MovingPoint(int a, int b) {
        x = a;
        y = b;
    }

    public void setVelocity(int a, int b) {
        vx = a;
        vy = b;
    }

    public void move() {
        x += vx;
        y += vy;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    public double getDistance(MovingPoint a) {
        double d = Math.sqrt((a.x - x) * (a.x - x) + (a.y - y) * (a.y - y));
        return d;
    }
}

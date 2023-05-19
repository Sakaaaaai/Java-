class Rectangle implements Relatable {
    private Point p1;
    private Point p2;

    Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getArea() {
        int width = Math.abs(p2.getX() - p1.getX());
        int height = Math.abs(p2.getY() - p1.getY());
        return width * height;
    }

    public boolean isSmallerThan(Relatable other) {
        Rectangle r = (Rectangle) other;
        return this.getArea() < r.getArea();
    }
}
class Quadrangle extends Shape {
    protected Point[] P;
    public Quadrangle(Point p1, Point p2, Point p3, Point p4){
    P = new Point[4];
    P[0] = p1;
    P[1] = p2;
    P[2] = p3;
    P[3] = p4;
    }
    public void print(){
    super.print();
    for(int i=0;i<P.length-1;i++)
    System.out.print("("+P[i].x+","+P[i].y+")"+"-");
    System.out.println("("+P[P.length-1].x+","+P[P.length-1].y+")");
    }
    public void move(int dx, int dy){
    for(int j=0;j<P.length;j++){
    P[j].x += dx;
    P[j].y += dy;
    }
    }
    }
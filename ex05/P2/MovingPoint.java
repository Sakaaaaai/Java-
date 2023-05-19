class MovingPoint{
    int x = 0;
    int y = 0;
    int vx = 0;
    int vy = 0;

    public MovingPoint(int a,int b){
      	x = a;
        y = b;
    }

    void setVelocity(int a,int b){
	vx = a;
        vy = b;
    }

    void move(){
	x += vx;
        y += vy;
    }
    
    void print(){
	System.out.println("("+x+","+y+")");
    }
    
    double getDistance(MovingPoint a){
    double d = Math.sqrt((a.x-x)*(a.x-x)+(a.y-y)*(a.y-y));
    return d;
    }
}

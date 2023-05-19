class Point{
    int x = 0;
    int y = 0;

    public Point(int a,int b){
	this.x = a;
        this.y = b;
    }

    void print(){
	System.out.println("("+x+","+y+")");
    }
    
    double getDistance(Point a){
    double d = Math.sqrt((a.x-x)*(a.x-x)+(a.y-y)*(a.y-y));
    return d;	
    }
	
}


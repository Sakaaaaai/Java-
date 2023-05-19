class Point{
    int x = 0;
    int y = 0;
    static int X_MIN = -100;
    static int X_MAX = 100;
    static int Y_MIN = -100;
    static int Y_MAX = 100;
    Point(){
	x=0;
	y=0;
    }
     void setX(int v){
	x = v;
    }

     void setY(int w){
	y = w;
    }

     int getX(){
	return x;
    }

     int getY(){
	return y;
    }

    void move(int dx, int dy){
	
	x += dx;
	y += dy;

	if(X_MAX < x || x < X_MIN){
	    x -= dx;
	    y -= dy;
	}

	if(Y_MAX < y || y < Y_MIN){
	    x -= dx;
	    y -= dy;
	}
    }
}

class Point{
    int x = 0, y = 0;

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
	
	if(100 < dx < -100){
	    x = dx;
	    y = dy;
	}

	if(100 < dy < -100){
	    x = dx;
	    y = dy;
	}
    }
}

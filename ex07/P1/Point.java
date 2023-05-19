class Point implements Relatable{
private int x;
private int y;

Point(int x,int y){
this.x = x;
this.y = y;
}

public int getX(){return x;}
public int getY(){return y;}

public boolean isSmallerThan(Relatable other){
Point p = (Point)other;
if(x == p.getX()){
    return y < p.getY();
    }
else {
return x < p.getX();
}
}
}


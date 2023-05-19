class Queue implements OpenList{
private int[] data = new int[31];
private int top = 0;
private int bottom =0;

public void push(int x){
data[top] = x;
top++;
}

public int pop(){
bottom++;
return data[bottom-1];
}

public boolean isEmpty() {
if(top == bottom){
    return true;
}else{
    return false;
} 
}

}
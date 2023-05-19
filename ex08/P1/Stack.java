class Stack implements OpenList{
private int[] data = new int[30];
private int top;

public void push(int x){
this.data[this.top] = x;
this.top++;
}

public int pop(){
this.top--;
return this.data[this.top];
}

public int size() {
return this.top;
}

public boolean isEmpty() {
    return this.size() == 0;
}
}
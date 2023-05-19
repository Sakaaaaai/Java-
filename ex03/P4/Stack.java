class Stack{
    int size=0;
    int[] stack = new int[100];

    void Push(int x){
	stack[size] = x;
	size++;
    }

    int Pop(){
	int x;
	size--;
	x = stack[size];
	stack[size] = 0;
	return x;
    }
}
	 
	
    
    

public class Stack {
    private int L;
    private int top;
    private int[] A;

    public Stack(int size) {
        L = size;
        A = new int[L];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (top == L - 1) {
            throw new StackOverflowException("Overflow. " + value + " can not be pushed.");
        }
        A[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Underflow. There is no element in the stack.");
        }
        return A[top--];
    }
}

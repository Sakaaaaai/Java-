class StackImplByDeque implements Stack {
  private Deque deque;

  public StackImplByDeque() {
      deque = new DequeImplByDLL();
  }

  public void push(int x) {
      deque.insertFront(x);
  }

  public int pop() {
      int top = deque.front();
      deque.removeFront();
      return top;
  }

  public int top() {
      return deque.front();
  }

  public int size() {
      return deque.size();
  }

  public boolean empty() {
      return deque.empty();
  }
}
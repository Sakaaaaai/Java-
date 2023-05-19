class QueueImplByDeque implements Queue {
  private Deque deque;

  public QueueImplByDeque() {
      deque = new DequeImplByDLL();
  }

  public void enqueue(int key) {
      deque.insertBack(key);
  }

  public int dequeue() {
      int front = deque.front();
      deque.removeFront();
      return front;
  }

  public int front() {
      return deque.front();
  }

  public int size() {
      return deque.size();
  }

  public boolean empty() {
      return deque.empty();
  }
}

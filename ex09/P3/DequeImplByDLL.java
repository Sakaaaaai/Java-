class DequeImplByDLL implements Deque {
  private SimpleDoublyLinkedList list;
  private int size;

  public DequeImplByDLL() {
      list = new SimpleDoublyLinkedList();
      size = 0;
  }

  public void insertFront(int key) {
      list.addFront(key);
      size++;
  }

  public void insertBack(int key) {
      list.addBack(key);
      size++;
  }

  public void removeFront() {
      if (!empty()) {
          list.removeFront();
          size--;
      }
  }

  public void removeBack() {
      if (!empty()) {
          list.removeBack();
          size--;
      }
  }

  public int front() {
      return list.front();
  }

  public int back() {
      return list.back();
  }

  public int size() {
      return size;
  }

  public boolean empty() {
      return size == 0;
  }
}
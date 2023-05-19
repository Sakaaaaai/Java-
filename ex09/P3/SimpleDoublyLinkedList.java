class SimpleDoublyLinkedList {
    private SimpleNode nil;

    public SimpleDoublyLinkedList() {
        nil = new SimpleNode();
        nil.setNext(nil);
        nil.setPrev(nil);
    }

    private void deleteNode(SimpleNode node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }

    public void removeFront() {
        deleteNode(nil.getNext());
    }

    public void removeBack() {
        deleteNode(nil.getPrev());
    }

    public int front() {
        return nil.getNext().getKey();
    }

    public int back() {
        return nil.getPrev().getKey();
    }

    public void addFront(int key) {
        SimpleNode newNode = new SimpleNode();
        newNode.setKey(key);
        newNode.setNext(nil.getNext());
        newNode.setPrev(nil);
        nil.getNext().setPrev(newNode);
        nil.setNext(newNode);
    }

    public void addBack(int key) {
        SimpleNode newNode = new SimpleNode();
        newNode.setKey(key);
        newNode.setPrev(nil.getPrev());
        newNode.setNext(nil);
        nil.getPrev().setNext(newNode);
        nil.setPrev(newNode);
    }
}

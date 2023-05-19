class SimpleNode {
    private int key;
    private SimpleNode next;
    private SimpleNode prev;
    
    public SimpleNode(int key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
    
    public int getKey() {
        return this.key;
    }
    
    public SimpleNode getNext() {
        return this.next;
    }
    
    public void setNext(SimpleNode next) {
        this.next = next;
    }
    
    public SimpleNode getPrev() {
        return this.prev;
    }
    
    public void setPrev(SimpleNode prev) {
        this.prev = prev;
    }
}
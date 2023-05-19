class SimpleList {
    private SimpleNode nil;
    
    public SimpleList() {
        init();
    }
    
    public void init() {
        nil = new SimpleNode(0);
        nil.setNext(nil);
        nil.setPrev(nil);
    }
    
    public SimpleNode listSearch(int key) {
        SimpleNode ans = nil.getNext();
        while (ans != nil && ans.getKey() != key) {
            ans = ans.getNext();
        }
        return ans;
    }
    
    public void printList() {
        SimpleNode ans = nil.getNext();
        while (ans != nil) {
            System.out.print(ans.getKey() + " ");
            ans = ans.getNext();
        }
        System.out.println();
    }
    
    public void delete(int key) {
        SimpleNode ans = listSearch(key);
        if (ans != nil) {
            ans.getPrev().setNext(ans.getNext());
            ans.getNext().setPrev(ans.getPrev());
            ans = null;
        }
    }
    
    public void insert(int key) {
        SimpleNode newNode = new SimpleNode(key);
        newNode.setPrev(nil);
        newNode.setNext(nil.getNext());
        nil.getNext().setPrev(newNode);
        nil.setNext(newNode);
    }
}
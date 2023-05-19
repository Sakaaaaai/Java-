public class SimpleList implements Aggregate {
    private SimpleNode nil;

    public SimpleList() {
        nil = new SimpleNode(0);
        nil.setNext(nil);
    }

    public SimpleNode getNil() {
        return nil;
    }

    public void insert(int key) {
        SimpleNode newNode = new SimpleNode(key);
        newNode.setNext(nil.getNext());
        nil.setNext(newNode);
    }

    public void delete(int key) {
        SimpleNode cur = nil.getNext();
        SimpleNode prev = nil;

        while (cur != nil) {
            if (cur.getKey() == key) {
                prev.setNext(cur.getNext());
                return;
            }
            prev = cur;
            cur = cur.getNext();
        }
    }

    @Override
    public Iterator forwardIterator() {
        return new SimpleListForwardIterator(this);
    }

    @Override
    public Iterator backwardIterator() {
        return new SimpleListBackwardIterator(this);
    }
}


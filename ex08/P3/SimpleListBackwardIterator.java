public class SimpleListBackwardIterator implements Iterator {
    private SimpleList simpleList;
    private SimpleNode cur;

    public SimpleListBackwardIterator(SimpleList simpleList) {
        this.simpleList = simpleList;
        cur = simpleList.getNil().getNext();

        // Traverse to the end of the list
        while (cur.getNext() != simpleList.getNil()) {
            cur = cur.getNext();
        }
    }

    @Override
    public boolean hasNext() {
        return cur != simpleList.getNil();
    }

    @Override
    public Object next() {
        Object target = cur;
        cur = findPrevious(cur);
        return target;
    }

    private SimpleNode findPrevious(SimpleNode node) {
        SimpleNode cur = simpleList.getNil().getNext();
        SimpleNode prev = simpleList.getNil();

        while (cur != simpleList.getNil()) {
            if (cur == node) {
                return prev;
            }
            prev = cur;
            cur = cur.getNext();
        }

        return prev;
    }
}


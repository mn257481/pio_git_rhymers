package edu.kis.vh.nursery.list;

class IntLinkedList {

    private Node last;
    private int i;
    private static final int EMPTY = -1;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    // TODO isFull is redundant if the list can never be full

    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

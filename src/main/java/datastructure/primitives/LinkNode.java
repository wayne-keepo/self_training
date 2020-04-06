package datastructure.primitives;

public class LinkNode<T> {
    private T data;
    private LinkNode<T> prev;
    private LinkNode<T> next;
    private int index = -2;
    private boolean head = false;
    private boolean tail = false;

    public LinkNode() {
    }

    public LinkNode(LinkNode prev, LinkNode next, T data, int index) {
        this.prev = prev;
        this.next = next;
        this.data = data;
        this.index = index;
    }


    public LinkNode<T> getPrev() {
        return this.prev;
    }

    public LinkNode<T> getNext() {
        return this.next;
    }

    public T getData() {
        return data;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void makeHead() {
        this.head = true;
    }

    public void makeTail() {
        this.tail = true;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }

    public void setPrev(LinkNode<T> prev) {
        this.prev = prev;
    }

    public boolean notHeadAndTail(){
        return head && tail;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

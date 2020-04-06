package datastructure.primitives;

public class cNode<T> {
    private cNode<T> node = null;
    private T data;
    private boolean root = false;
    public cNode(){}

    public cNode(cNode ref, T data){
        this.node = ref;
        this.data = data;
    }

    public cNode(T data){
        this.data = data;
    }

    public void setRef(cNode<T> node) {
        this.node = node;
    }

    public void makeRoot() {
        this.root = true;
    }

    public boolean isRoot(){
        return root;
    }

    public T getData() {
        return data;
    }

    public cNode<T> getRef() {
        return node;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

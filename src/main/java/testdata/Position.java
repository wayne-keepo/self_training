package testdata;

public class Position {
    private int hash;
    private int top;
    private int inner;

    public Position(){}

    public Position(int hash, int top, int inner){
        this.hash = hash;
        this.top = top;
        this.inner = inner;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getInner() {
        return inner;
    }

    public void setInner(int inner) {
        this.inner = inner;
    }
}

package datastructure.primitives;

import java.util.Arrays;

// TODO: custom list implemented not correctly

public class cList<T> {
    private cNode<T>[] nodes;

    public cList(T... o) {
        ini(o);
    }


    public T get(int index) {
        return index < nodes.length ? nodes[index].getData() : null;
    }

    public void add(T data) {
        cNode<T> newNode = new cNode<>(data);
        extend(1);
        nodes[nodes.length - 1] = newNode;
        toTie();
        info("Add");
    }

    public void remove(T o) {
        int index = indexOf(o);
        if (index == 0) {
            removeRoot();
            info("Remove");
            return;
        }
        if (index == nodes.length - 1) {
            removeTail();
            info("Remove");
            return;
        }
        if (index > 0 && index < nodes.length)
            remove(index);
        info("Remove");
    }

    private void removeRoot() {
        if (nodes.length == 1) {
            nodes = new cNode[0];
            return;
        }
        cNode[] tmp = new cNode[nodes.length - 1];
        for (int i = 1; i < nodes.length; i++)
            tmp[i - 1] = nodes[i];
        nodes = tmp;
        nodes[0].makeRoot();
    }

    private void removeTail() {
        cNode[] tmp = new cNode[nodes.length - 1];  // think that is can move as Copy method hmm
        for (int i = 0; i < nodes.length - 1; i++)
            tmp[i] = nodes[i];
        nodes = tmp;
        nodes[nodes.length - 1].setRef(null);
    }

    private void remove(int index) {
        cNode[] tmp = new cNode[nodes.length - 1];
        for (int i=0, k=0; i<nodes.length; i++, k++){
            if (index==i)
                tmp[k] = nodes[++i];
            else
                tmp[k] = nodes[i];
        }
        nodes = tmp;
    }

//    private cNode<T>[] merge(cNode[] m1, cNode[] m2){
//        cNode<T>[] tmp = new cNode[m1.length + m2.length];
//        for (int i = 0; i < m1.length; i++)
//            tmp[i]=m1[i];
//        int k=0;
//        for (int i = m1.length; i < m2.length; i++)
//            tmp[i]=m2[k++];
//        return tmp;
//    }

    public boolean contains(T o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(T o) {
        for (int i = 0; i < nodes.length; i++)
            if (nodes[i].getData().equals(o))
                return i;
        return -1;
    }

    public boolean isEmpty() {
        return nodes.length > 0;
    }

    private void ini(T[] o) {
        nodes = new cNode[o.length]; // ?????
        for (int i = 0; i < o.length; i++) {
            nodes[i] = new cNode<T>(o[i]);
        }
        iniRefs();
    }

    private void iniRefs() {
        nodes[0].makeRoot();
        for (int i = 0; i < nodes.length; i++) {
            if (i + 1 == nodes.length)
                continue;
            nodes[i].setRef(nodes[i + 1]);
        }
    }

    private void extend(int n) {
        cNode<T>[] tmp = new cNode[nodes.length + n];
        for (int i = 0; i < nodes.length; i++)
            tmp[i] = nodes[i];
        nodes = tmp;
    }

    private void toTie() {
        for (int i = 0; i < nodes.length; i++)
            if (i + 1 == nodes.length)
                nodes[i - 1].setRef(nodes[i]);
    }

    public void info(String operation) {
        System.out.printf("Operation: %s\n Size: %d\n Data: %s\n", operation, nodes.length, Arrays.toString(nodes));
    }
}

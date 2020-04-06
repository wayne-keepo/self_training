package datastructure.advanced.hashes;

import java.util.Arrays;
import java.util.Objects;

public class cHashTable {

    private Object[] table;
    private int DEFAULT_SIZE = 15;
    private int custom_size = 0;
    private int count = 0;

    public cHashTable() {
        table = new Object[DEFAULT_SIZE];
    }

    public cHashTable(int arr_size) {
        this.custom_size = arr_size;
        table = new Object[custom_size];
    }

    public boolean add(Object o) {
        int pos = calcPosition(o);
        System.out.println("o is: " + o.toString() + " hash: " + Objects.hash(o) + " position: " + pos);
        if (table.length < pos)
            return false;
        if (table[pos] == null) {
            Object[] v = new Object[custom_size > 0 ? custom_size : DEFAULT_SIZE];
            v[pos] = o;
            table[pos] = v;
            count++;
            return true;
        } else {
            ((Object[]) table[pos])[pos] = o;
            count++;
            return true;
        }
    }

    public Object update(Object old, Object neW) {
        int pos = calcPosition(old);
        if (table.length < pos)
            return null;
        ((Object[]) table[pos])[pos] = neW;
        return old;
    }


    public Object get(Object o) {
        int pos = calcPosition(o);
        if (table.length < pos)
            return null;
        return ((Object[]) table[pos])[pos];
    }

    public Object get(int idx) {
        if (table.length < idx)
            return null;
        return ((Object[]) table[idx])[idx];
    }

    public Object find(Object o) {
        int pos = calcPosition(o);
        if (table.length < pos)
            return null;
        return ((Object[]) table[pos])[pos];
    }

    private int calcPosition(Object o) {
        return Math.abs(o.hashCode() % table.length);

    }

    public String sout() {
        return Arrays.toString(table);
    }
}

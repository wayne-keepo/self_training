package datastructure.primitives;

import java.util.Arrays;

// TODO: rewrite copying array logic via System.arrycopy

public class cStack {
    private Object[] stack;
    private int lastIndex;

    public cStack(Object... o) {
        this.stack = o;
        this.lastIndex = stack.length-1;
    }

    public void push(Object o) {
        Object[] newStack = new Object[stack.length+1];
        for (int i = 0; i <= lastIndex; i++)
            newStack[i] = stack[i];
        lastIndex++;
        newStack[lastIndex] = o;
        stack = newStack;
        newStack = null;
        info();
    }

    public Object pop() {
        Object o = stack[lastIndex];
        Object[] newStack = new Object[lastIndex];
        for (int i = 0; i < lastIndex ; i++)
            newStack[i] = stack[i];
        stack = newStack;
        lastIndex--;
        newStack = null;
        info();
        return o;
    }

    public boolean isEmpty() {
        return stack.length < 1;
    }

    public Object top() {
        return stack[lastIndex];
    }

    public void info(){
        System.out.printf("Last index: %d\nElements: %s\n", lastIndex, Arrays.toString(stack));
    }
}

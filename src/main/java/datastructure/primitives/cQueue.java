package datastructure.primitives;

import java.util.Arrays;

public class cQueue {
    private Object[] queue;

    public cQueue(Object... os) {
        this.queue = os;

    }

    /**
     * Enqueue () — вставляет элемент в конец очереди
     * Dequeue () — удаляет элемент из начала очереди
     * isEmpty () — возвращает значение true, если очередь пуста
     * Top () — возвращает первый элемент очереди
     */


    public void enqueue(Object o) {
        Object[] q = new Object[queue.length + 1];
        for (int i = 0; i < queue.length; i++)
            q[i] = queue[i];
        q[queue.length - 1] = o;
        queue = q;
        info("Enqueue");
    }

    public void dequeue() {
        Object[] q = new Object[queue.length - 1];
        for (int i = 1; i < queue.length; i++)
            q[i - 1] = queue[i];
        queue = q;
        info("Dequeue");
    }

    public Object top() {
        return queue[0];
    }

    public boolean isEmpty() {
        return queue.length < 1;
    }


    public void info(String operation) {
        System.out.printf("Operation: %s\n Last index: %d\n Queue: %s\n", operation, queue.length - 1, Arrays.toString(queue));
    }
}


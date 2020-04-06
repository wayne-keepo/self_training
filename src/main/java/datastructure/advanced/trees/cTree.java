package datastructure.advanced.trees;

public class cTree<T> {
    private TreeNode<T> root;
    private int size = 0;
    private final int factor = 17;

    public cTree() {
    }


    // type T must be comparable,
    // but if use hash code for comparison, then we do not need a property comparison for compare(),
    // but then each element is unique and we can not update it only delete and add new heh
    public T add(T data) {
        if (data == null)
            return null;
//        int pos = calcPos(data);
        int pos = data.hashCode();
        System.out.println("Data: " + data + " hash: " + data.hashCode());

        if (root == null) {
            root = new TreeNode<>(data, null, pos, 0);
            root.color = TreeNode.Color.BLACK;
            size++;
            return null;
        }
        var tmp = root;
        int pathSize = 0;
        int ppos = tmp.pos;
        TreeNode<T> parent = root;
        while (tmp != null) {
            ppos = tmp.pos;
            parent = tmp;
            if (pos > ppos) {
                tmp = tmp.right;
                pathSize++;
            } else if (pos < ppos) {
                tmp = tmp.left;
                pathSize++;
            } else { // Can there be such a situation if i'm using hashcode of data? i think yes
                var kek = parent.data;
                tmp.data = data;
                return kek;
            }
        }

        var node = new TreeNode<>(data, parent, pos, ++pathSize);

        if (pos > ppos)
            parent.right = node;
        else
            parent.left = node;

//        rebalance(node);
        size++;

        return null;
    }


    private void rebalance(TreeNode<T> node) {
        while (node != null && node != root && node.parent.color != TreeNode.Color.RED) {
            if (node.parent.parent != null) {
                if (node.parent == node.parent.parent.left) { // if parent is left child of grandparent
                    if (node.parent.parent.right != null && node.parent.parent.color == TreeNode.Color.RED){ // if uncle is RED
                        // parent.cplpr -> Black && uncle.color -> Black
                        node.parent.color = TreeNode.Color.BLACK;
                        node.parent.parent.right.color = TreeNode.Color.BLACK;
                        node.parent.parent.color = TreeNode.Color.RED;
                        if (node.parent.parent == root) {
                            node.parent.parent.color = TreeNode.Color.BLACK;
                            return; // hm?
                        }
                        node = node.parent.parent;
                    } else {
                        node.parent.parent.color =  TreeNode.Color.RED;
                        node.parent.color = TreeNode.Color.BLACK;
                        rightRotate(node);
                    }
                }
                if (node == node.parent.left) {
                    if (node.parent.parent.right != null && node.parent.parent.right.color == TreeNode.Color.RED) {

                    }
                    rightRotate(node);
                    root = node.parent;
                    node.parent.right = node.parent.parent;
                    node.parent.parent = node.parent;
                    node.parent.parent = null;
                    root.color = TreeNode.Color.BLACK;

                } else {
                    // child is right node
                }
            }
        }
    }

    private void rightRotate(TreeNode<T> node) {
        var parent = node.parent;
        var grandparent = parent.parent;
        if (grandparent.parent == null)
            root = parent;
        parent.right = grandparent;
        parent.parent = grandparent.parent; // if gp is root -> parent root
        grandparent.parent = parent;

    }
/*
    private void fixAfterInsertion(Entry<K, V> x) {
        x.color = RED;

        while (x != null && x != root && x.parent.color == RED) {
            if (parentOf(x) == leftOf(parentOf(parentOf(x)))) { // если папа является левым листом деда
                Entry<K, V> y = rightOf(parentOf(parentOf(x))); // получили дядю чилда
                if (colorOf(y) == RED) { // если дядя красного цвета
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == rightOf(parentOf(x))) { // если чилд является правым листом папы
                        x = parentOf(x);
                        rotateLeft(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateRight(parentOf(parentOf(x)));
                }
            } else {
                Entry<K, V> y = leftOf(parentOf(parentOf(x)));
                if (colorOf(y) == RED) {
                    setColor(parentOf(x), BLACK);
                    setColor(y, BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    x = parentOf(parentOf(x));
                } else {
                    if (x == leftOf(parentOf(x))) {
                        x = parentOf(x);
                        rotateRight(x);
                    }
                    setColor(parentOf(x), BLACK);
                    setColor(parentOf(parentOf(x)), RED);
                    rotateLeft(parentOf(parentOf(x)));
                }
            }
        }
        root.color = BLACK;
    }
*/

    private int calcPos(T data) {
        return data.hashCode() % factor;
    }

    public int size() {
        return size;
    }

    static class TreeNode<T> {
        private TreeNode<T> parent;
        private TreeNode<T> left;
        private TreeNode<T> right;
        private T data;
        private Color color = Color.RED;
        private int pos;
        private int pathCount;

        TreeNode(T data, TreeNode<T> parent, int pos, int pathCount) {
            this.data = data;
            this.parent = parent;
            this.pos = pos;
            this.pathCount = pathCount;
        }

        enum Color {
            RED, BLACK;

            Color() {
            }
        }
    }

    public String print() {
        StringBuilder builder = new StringBuilder('\t');
//        for ()
        return "";
    }
}

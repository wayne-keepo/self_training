import datastructure.advanced.trees.cTree;
import testdata.Human;

public class TestRunner {


    public static void main(String[] args) {
//        System.out.println(123563 % 17);
        var h1 = new Human(1, "One");
        var h2 = new Human(2, "Two");
        var h3 = new Human(3, "Three");
        var h4 = new Human(4, "Four");
        var h5 = new Human(5, "Five");
        var h6 = new Human(6, "Six");

        cTree<Human> tree = new cTree<>();

        tree.add(h1);
        tree.add(h2);
        tree.add(h3);
        tree.add(h4);
        tree.add(h5);
        tree.add(h6);

        System.out.println(tree.size());
//        System.out.println(tree);
    }

}

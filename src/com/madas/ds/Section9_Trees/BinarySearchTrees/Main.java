package com.madas.ds.Section9_Trees.BinarySearchTrees;

public class Main {

    /*
     *
     * BST is a special kind of Binary tree (tree where every element has 0, 1, 2 children). In a BST, for any node, all the elements less than the node are to the left of it,
     *  all the elements greater than node are to the right of it.
     *
     *  Insertion, Deletion, Getting elements are done in O(log n) time.
     *
     *  In BST, there are 3 ways to handle duplicate values.
     *  * Either we don't allow duplicate values.
     *  * We always insert the duplicate values to the right subtree or left, but always choose the same side.
     *  * Keep a counter, so that if a duplicate value is inserted, just increase the counter so that it denotes that there are multiple instances of it.
     *
     * */
    public static void main(String[] args) {
        IntTree tree = new IntTree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

//        System.out.println(tree.get(30));
//        System.out.println(tree.get(26));
//        System.out.println(tree.get(9999));

//        System.out.println(tree.min());
//        System.out.println(tree.max());

        tree.traversePreOrder();

        /*tree.delete(25);
        tree.traverseInOrder();
        System.out.println();

        tree.delete(15);
        tree.traverseInOrder();
        System.out.println();


        tree.delete(888);
        tree.traverseInOrder();*/

    }
}

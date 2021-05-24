package com.madas.ds.Section9_Trees.BinarySearchTrees;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public void insert(int toInsert) {
        if (toInsert == value) {
            return;
        } else if (toInsert < value) {
            if (left == null) {
                left = new TreeNode(toInsert);
            } else {
                left.insert(toInsert);
            }
        } else {
            if (right == null) {
                right = new TreeNode(toInsert);
            } else {
                right.insert(toInsert);
            }
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(value + ", ");
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        System.out.print(value + ", ");
        if (left != null) {
            left.traversePreOrder();
        }
        if (right != null) {
            right.traversePreOrder();
        }
    }

    public TreeNode get(int element) {
        if (element == value) {
            return this;
        } else if (element < value) {
            if (left != null) {
                return left.get(element);
            }
        } else {
            if (right != null) {
                return right.get(element);
            }
        }
        return null;
    }

    public int min() {
        if (left == null) {
            return value;
        } else {
            return left.min();
        }
    }

    public int max() {
        if (right == null) {
            return value;
        } else {
            return right.max();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

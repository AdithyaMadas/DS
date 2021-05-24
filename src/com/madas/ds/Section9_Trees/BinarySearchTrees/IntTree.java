package com.madas.ds.Section9_Trees.BinarySearchTrees;

public class IntTree {
    TreeNode root;

    public void insert(int toInsert) {
        if (root == null) {
            root = new TreeNode(toInsert);
        } else {
            root.insert(toInsert);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        if (root != null) {
            root = delete(root, value);
        }
    }

    private TreeNode delete(TreeNode subTree, int value) {
        if (subTree == null) {
            return null;
        }

        if (value < subTree.value) {
            subTree.left = delete(subTree.left, value);
        } else if (value > subTree.value) {
            subTree.right = delete(subTree.right, value);
        } else {

            //Cases 1 and 2: Node to delete either has 0 or 1 subtree, then we delete that particular node, assign the remaining subtree at that position
            if (subTree.left == null) {
                return subTree.right;
            } else if (subTree.right == null) {
                return subTree.left;
            }

            //Case 3: If the node has both left and right subtree, then we replace that node with least value from the right subtree, in doing so, least number of
            // exchanges need to be done.
            subTree.value = subTree.right.min();

            //Delete the min node now, as now it is now been replaced by the node which had to be deleted.
            subTree.right = delete(subTree.right, subTree.value);
        }

        return subTree;
    }

    public Integer min() {
        if (root != null) {
            return root.min();
        }
        return null;
    }

    public Integer max() {
        if (root != null) {
            return root.max();
        }
        return null;
    }
}

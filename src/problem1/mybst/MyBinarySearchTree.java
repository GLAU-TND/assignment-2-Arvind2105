/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> {
    public int numberOFLeftChild = 0;
    private TreeNode<E> root;
    private int maxLevel = 0;

    public TreeNode<E> getRoot() {
        return root;
    }

    public boolean add(E data) {
        return true;
    }

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));
        } else if ((Integer) data > (Integer) currentNode.getData()) {
            currentNode.setRightChild(addRecursive(currentNode.getRightChild(), data));
        }
        return currentNode;
    }

    private void printLeftChild(TreeNode<E> node, int level) {
        if (node == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.print(node.getData() + " ");
        }
        maxLevel = level;
        if (node.getLeftChild() == null) {
            numberOFLeftChild++;
            maxLevel++;
        }
        printLeftChild(node.getLeftChild(), level + 1);
        printLeftChild(node.getRightChild(), level = 1);

    }
}

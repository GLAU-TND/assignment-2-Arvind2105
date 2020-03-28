/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(5);
        myBinarySearchTree.add(6);
        myBinarySearchTree.add(8);
        myBinarySearchTree.add(20);
        System.out.println("traverse the tree in PreOrder:");
        traversePreOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.println("Traverse the tree in PostOrder");
        traversePostOrder(myBinarySearchTree.getRoot());


    }

    public static void traversePreOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            System.out.println(currentNode.getData() + " ");
            traversePreOrder(currentNode.getLeftChild());
            traversePreOrder(currentNode.getRightChild());
        }

    }

    public static void traversePostOrder(TreeNode<Integer> currentNode) {
        if (currentNode != null) {
            traversePostOrder(currentNode.getLeftChild());
            traversePostOrder(currentNode.getRightChild());
            System.out.print(currentNode.getData() + " ");
        }

    }
}

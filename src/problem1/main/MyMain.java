/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<Integer>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(20);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(1);
        myBinarySearchTree.add(2);
        myBinarySearchTree.add(3);
        myBinarySearchTree.add(4);
        myBinarySearchTree.add(18);
        myBinarySearchTree.add(19);
        myBinarySearchTree.add(50);
        myBinarySearchTree.print();
        System.out.println("number of nodes who don't have their left child" + myBinarySearchTree.numberOFLeftChild);


    }
}

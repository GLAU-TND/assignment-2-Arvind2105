/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements which are added in binary search tree");
        String s = sc.nextLine();
        String[] ar = s.split(" ");
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        for (String s1 : ar) {
            myBinarySearchTree.add(Integer.parseInt(s1));

        }

    }
}

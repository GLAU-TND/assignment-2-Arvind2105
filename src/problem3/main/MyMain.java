/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> myPriorityQueue = new MyPriorityQueue<>();
        myPriorityQueue.add(new Student(1, "luv"));
        myPriorityQueue.add(new Student(2, "arvind"));
        myPriorityQueue.add(new Student(3, "ayush"));
        myPriorityQueue.add(new Student(4, "kush"));
        myPriorityQueue.add(new Student(5, "vinod"));
        System.out.println(myPriorityQueue);

    }
}

/*
Ability to create Linked List by appending 30 and 70 to 56
- Node with data 56 is First Created
- Next Append 30 to 56
- Finally Append 70 to 30
- LinkedList Sequence: 56->30->70
 */
package com.bridgelabz;
import java.util.Scanner;
//class for node
class Node{
    public int key;
    public Node next;
    //constructor
    public Node(int data){
        this.key = data;
        this.next = null;
    }
}
//Linked List class
public class LinkedList {
    //declaring Nodes
    Node head, tail;
    public Node add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;//56=>30=>70
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void append(int data) { // 56=> 30=> 70
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.key + " ");
                temp = temp.next;
            }
        }
    }
    //main method runs
    public static void main (String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data.");
        System.out.println("Enter 2 to append the data.");
        switch (scanner.nextInt()) {

            case 1:
                Operations.addData();
                break;
            case 2:
                Operations.addDataAppend();
                break;
        }
    }
}
//method for operations: add and append
class Operations {
    //created method to add data
    public static void addData() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        linkedList.print();
    }

    // Created a method to append data
    public static void addDataAppend() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
}
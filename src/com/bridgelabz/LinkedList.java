/*
Ability to insert 30 between 56 and 70
- Final Sequence: 56->30->70
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
    //method to add the data
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
    //method for append the data
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
    //method for inserting the data in between
    public void insertInBetween(Node previousNode ,Node newNode){
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
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
        System.out.println("Enter 3 to insert the data in between");
        switch (scanner.nextInt()) {

            case 1:
                Operations.addData();
                break;
            case 2:
                Operations.addDataAppend();
                break;
            case 3:
                Operations.insertInBetween();
                break;
        }
    }
}
//method for operations: add and append
class Operations {
    //created method to add data
    public static void addData() {
        LinkedList l1 = new LinkedList();
        l1.add(70);
        l1.add(30);
        l1.add(56);
        l1.print();
    }

    // Created a method to append data
    public static void addDataAppend() {
        LinkedList l2 = new LinkedList();
        l2.append(56);
        l2.append(30);
        l2.append(70);
        l2.print();
    }
    //method to indert the data in between
    public static void insertInBetween(){
        LinkedList linkedList=new LinkedList();
        Node secondNode =linkedList.add(70);
        Node firstNode =linkedList.add(56);
        Node newNode =new Node(30);
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(firstNode,newNode);
        System.out.println(                             );
        System.out.println("After");
        linkedList.print();
    }
}
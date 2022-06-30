//create a simple Linked List of 56, 30 and 70
package com.bridgelabz;

class Node{
    int key;
    Node next;
    //constructor
    public Node(int key) {
        this.key = key;
        this.next=null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program.");
        //assigning values to the nodes
        Node firstNode=new Node(56);
        Node secondNode=new Node(30);
        Node thirdNode=new Node(70);
        //declaring
        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        Node tail =thirdNode;
        //Initially temp is head
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.key);
            temp =temp.next;
        }
    }
}
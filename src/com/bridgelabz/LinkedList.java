/*
Ability to delete the first element in the LinkedList of sequence 56->30->70
 */
package com.bridgelabz;
import java.util.Scanner;

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
    //pop method
    public void pop(){
        if(this.head==null){

        }
        Node temp =head;
        head = temp.next;
        temp =null;
    }
    //print method
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
        System.out.println("Enter the options:\n1. Add the data.\n2. Append the data.\n3. Insert in between\n4. Delete the data at first position.");
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
            case 4:
                Operations.pop();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

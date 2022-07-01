/*
Ability to search LinkedList to find Node with value 30
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
    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }
    //pop method
    public void pop() {
        if (this.head == null) {

        }
        Node temp = head;
        head = temp.next;
        temp = null;
    }
    //PopLast
    public void popLast() {
        if (head == null)
            System.out.println("No elements to delete..");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }
    public void search() {
        System.out.println("Enter the key you want to search:");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(head.key == data)
            System.out.println(data + " is Found");
        else {
            Node n = head;
            boolean searching = false;
            while(n!=null) {
                if(n.key == data) {
                    searching = true;
                    break;
                }
                n = n.next;
            }
            if(searching == true)
                System.out.println(data+ " is found in this linked list");
            else
                System.out.println(data+" is not found.");
        }
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
    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Add the data.\n2. Append the data.\n3. Insert in between\n4. " +
                "Delete the data at first position.\n5. Delete at last position.\n6. Find the node");
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
            case 5:
                Operations.popLast();
                break;
            case 6:
                Operations.search();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}

package com.bridgelabz;

public class Operations {
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
    //method to insert the data in between
    public static void insertInBetween() {
        LinkedList l3 = new LinkedList();
        Node secondNode = l3.add(70);
        Node firstNode = l3.add(56);
        Node newNode = new Node(30);
        System.out.println("Before");
        l3.print();
        l3.insertInBetween(firstNode, newNode);
        System.out.println();
        System.out.println("After");
        l3.print();
    }
    //pop method
    public static void pop() {
        LinkedList l4 = new LinkedList();
        Node firstNode = l4.add(70);
        Node secondNode = l4.add(30);
        Node newNode = l4.add(56);
        System.out.println("Before");
        l4.print();
        l4.pop();
        System.out.println();
        System.out.println("After");
        l4.print();
    }
    public static void popLast(){
        LinkedList l5=new LinkedList();
        Node firstNode= l5.add(70);
        Node secondNode= l5.add(30);
        Node newNode=l5.add(56);
        System.out.println("Before");
        l5.print();
        System.out.println();
        l5.popLast();
        System.out.println("After");
        l5.print();
    }
    public static void search(){
        LinkedList l6=new LinkedList();
        Node firstNode = l6.add(70);
        Node secondNode = l6.add(30);
        Node newNode=l6.add(56);
        l6.search();
        System.out.println("The linked list is: ");
        l6.print();
    }
    public static void insertPosition() {
        LinkedList l7=new LinkedList();
        Node firstNode= l7.add(70);
        Node secondNode= l7.add(30);
        Node newNode=l7.add(56);
        System.out.println("Before");
        l7.print();
        l7.insertAtPosition();
        System.out.println("After inserting");
        l7.print();
    }
}
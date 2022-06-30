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
        LinkedList linkedList = new LinkedList();
        Node firstNode = linkedList.add(70);
        Node secondNode = linkedList.add(30);
        Node newNode = linkedList.add(56);
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println();
        System.out.println("After");
        linkedList.print();
    }
}

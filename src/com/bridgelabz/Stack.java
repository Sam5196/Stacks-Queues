package com.bridgelabz;

public class Stack {
    static Node head;
    public static int count = 1;
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public Node pop() {
        System.out.println("Popped element is : " + head.data);
        head = head.next;
        return head;
    }
    public void peak() {
        if (head != null) {
            System.out.println("Top of the stack is " + head.data);
        } else {
            System.out.println("No element left in the stack.");
            return;
        }
    }
    public void printList() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }

    }
}
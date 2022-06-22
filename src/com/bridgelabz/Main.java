package com.bridgelabz;

public class Main {
    public static void main(String[] args) {

        Stack list = new Stack();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.printList();
    }
}

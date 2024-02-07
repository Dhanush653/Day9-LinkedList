package com.bridgelabz.linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedlist {
    Node head;
    public MyLinkedlist() {
        head = null;
    }
    // Insert Node At The Beginning
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        // List is empty
        if(head == null){
            head = newNode;
        }
        // List is not empty
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    //Insert Node At The End
    public void append(int val){
        Node newNode1 = new Node(val);
        if(head == null){
            head = newNode1;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode1;
        }
    }
    // Insert a Node After A Certain Node
    public void insertAfter(int val, int insertAfter) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current != null && current.data != insertAfter) {
                current = current.next;
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }
    // Delete The Last Node
    public void deletelastnode(){
        if(head == null || head.next == null){
            head = null;
        }
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }
    //Position In Which The Node Occur
    public void search(int val){
        int count = 0;
        Node current = head;
        while(current.data != val){
            current = current.next;
            count+=1;
        }
        System.out.println(count);

    }
    //Delete the Given Node From The Linkedlist
    public void deleteParticularElement(int val){
        Node current = head;
        Node previous = null;
        if(head.data == val && head != null){
            head = current.next;
        }
        else{
            while(current != null && current.data != val){
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
    }

    // display the length of the Linked list
    public void size(){
        Node current = head;
        int count = 0;
        while(current.next != null){
            count += 1;
            current = current.next;
        }
        System.out.println("Size of Linkedlist is: "+count);
    }
    // Add data in Ascending order
    public void add(int val){
        Node newNode1 = new Node(val);
        if(head == null || val < head.data){
            newNode1.next  = head;
            head = newNode1;
            return;
        }
        Node current = head;
        Node prev = null;

        while(current != null && val >= current.data){
            prev = current;
            current = current.next;
        }
        prev.next = newNode1;
        newNode1.next = current;
    }
    public void display() {
        //head = head.next; To delete the first node
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

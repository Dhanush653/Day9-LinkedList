package com.bridgelabz.linkedlist;

class Node{
    int data;
    // next is a reference variable used to refer the next node
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist {
    Node head;
    public Linkedlist(){
        head = null;
    }
    public void insert(int val){
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
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

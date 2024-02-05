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
            Node current = head;
            // To find the last node
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
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

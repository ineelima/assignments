package com.dwivedi.dataStructure;

import java.util.Scanner;
public class LinkedList {
    Node head;
    public void insert(Node n) {
        if (head == null) {
            head = n;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }
    public void insertAtHead(Node n){
        n.next=head;
        head=n;//head moving to first position
    }

    public void displayList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public int getSize(){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("The length of the list is :"+count);
        return count;
    }

    public void InsertINTheMiddle(Node n){
        Node temp=head;
        int length=getSize()/2;
        for(int i=0;i<length;i++){
            temp=temp.next;
        }
        n.next=temp.next;//first give the handle of new node to the next node
        temp.next=n;//then give the handle of Node n to the previous node
    }
    public boolean deleteNode(Node n) {

        if (head == null) {
            return true;
        } else if (head.data == n.data) {
            head = head.next;
            return true;
        } else {
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                temp = temp.next;//going to second node
                if (temp.data == n.data) {
                    prev.next = temp.next;
                    return true;
                }
                prev = prev.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements in linked list");
        int count = scan.nextInt();
        LinkedList obj1 = new LinkedList();
        for (int i = 0; i < count ; i++) {
            Node n = new Node(i);
            obj1.insert(n);
        }
        obj1.displayList();
        System.out.println("Enter the element you want to add at the head position");
        int elementATHead=scan.nextInt();
        obj1.insertAtHead(new Node(elementATHead));
        System.out.println("the list after adding the first element");
        obj1.displayList();
        System.out.println("The element to be added in the middle of the list");
        int elementInMiddle=scan.nextInt();
        obj1.InsertINTheMiddle(new Node(elementInMiddle));
        System.out.println("The list after adding in the middle of the list");
        obj1.displayList();
        System.out.println("Enter the element to be deleted");
        int j= scan.nextInt();
        obj1.deleteNode(new Node(j));
        System.out.println("The list after After deleting");
        obj1.displayList();
    }
}
















package com.practice.prepBytes.linked_list;
import java.util.*;
  import java.io.*;
  
  class Node1 {
    int data;
    Node1 next;
    Node1(int data){
      this.data = data;
      this.next = null;
    }
  }
  
  class LinkedList1{
    Node1 head = null;

    public void insertAtEnd(int data){
      Node1 newNode1 = new Node1(data);
      if(head == null ){
        head = newNode1;
      }
      else{
      Node1 temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode1;
    }
   }

  public void insertNode1(int data){
    Node1 node = new Node1(data);
    if(head == null)
      return;
    if(head.data >=data) {
    	node.next = head;
    	head = node;
    	return;
    }
    Node1 temp = head;
    Node1 tempSecond = null;
    while(temp.next != null){
      tempSecond = temp;
      temp = temp.next;
      if(tempSecond.data<=data && temp.data>=data)
        break;
    }
    if(temp.next==null && temp.data<=data){
      insertAtEnd(data);
    }
    else{
    tempSecond.next = node;
    node.next = temp;
  }
  }

   public void printNode1s(){
     if(head!=null){
        Node1 tempNode1 = head;
        while(tempNode1!=null){
          System.out.print(tempNode1.data + " ");
          tempNode1 = tempNode1.next;
        }
     }
   }
  }
  
  public class InsertInMiddle {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      while(times-- != 0){
        int length = scan.nextInt();
        LinkedList1 list = new LinkedList1();
        while(length-- != 0){
          list.insertAtEnd(scan.nextInt());
        }
        int data = scan.nextInt();
        list.insertNode1(data);
        list.printNode1s();
        System.out.println();
      }
      
    }
  }
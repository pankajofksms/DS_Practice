package com.practice.prepBytes.linked_list;
import java.util.*;
  import java.io.*;
  
  class Node {
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  
  class LinkedList{
    Node head = null;
    public void insertAtEnd(int data){
      Node newNode = new Node(data);
      if(head == null ){
        head = newNode;
      }
      else{
      Node temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
   }
   
   public void bringLastToFront(){
     Node temp = head;
     Node tempSecond = null;
     if(head==null || head.next==null){
       return;
     }
     while(temp.next!=null){
       tempSecond = temp;
       temp = temp.next;
     }
     temp.next = head;
     head = temp;
     tempSecond.next = null;
   }
   
   public void printNodes(){
     if(head!=null){
        Node tempNode = head;
        while(tempNode!=null){
          System.out.print(tempNode.data + " ");
          tempNode = tempNode.next;
        }
     }
   }
  }
  
  public class BringLastToFront {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      int length;
      while(times-- != 0){
        Node head = null;
        length = scan.nextInt();
        LinkedList list = new LinkedList();
        while(length-- != 0){
          int data = scan.nextInt();	
          list.insertAtEnd(data);
        }
        list.bringLastToFront();
        list.printNodes();
        System.out.println(); 
      }
      
    }
    
    
  }
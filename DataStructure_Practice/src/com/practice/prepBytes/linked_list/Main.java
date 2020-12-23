package com.practice.prepBytes.linked_list;
import java.util.*;
  import java.io.*;
  
  class Node2 {
    int data;
    Node2 next;
    Node2(int data){
      this.data = data;
      this.next = null;
    }
  }
  
  class LinkedList2{
    Node2 head = null;

    public void insertAtEnd(int data){
      Node2 newNode2 = new Node2(data);
      if(head == null ){
        head = newNode2;
      }
      else{
      Node2 temp = head;
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode2;
    }
   }
   
   public void reverse(){
     Node2 current = head;
     Node2 prev = null;
     Node2 next;
     while(current!=null){
       next = current.next;
       current.next = prev;
       prev = current;
       current = next;
     }
     head = prev;
   }
   
    public void printNode2s(){
     if(head!=null){
        Node2 tempNode2 = head;
        while(tempNode2!=null){
          System.out.print(tempNode2.data + " ");
          tempNode2 = tempNode2.next;
        }
     }
   }
  }

  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      while(times-- != 0){
        int length = scan.nextInt();
        LinkedList2 list = new LinkedList2();
        while(length-- != 0){
          list.insertAtEnd(scan.nextInt());
        }
        int data = scan.nextInt();
        list.reverse();
        list.printNode2s();
        System.out.println();
      }
      
    }
  }
package com.practice.prepBytes.heap;
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int mod=1000000007;
        while(t-->0){
            int size=sc.nextInt();
            long[] arr=new long[size+1];
            arr[0]=Integer.MIN_VALUE;
            for(int i=1;i<=size;i++){
                int temp=sc.nextInt();
                insert(arr,i,temp);

            }
            build(arr,size);
            while(size>1){
                if(size==2){
                    long P=arr[1];
                    long Q=arr[2];
                    long opt=(P*3-Q*2)%mod;
                    arr[1]=opt;
                    size--;
                }
                else{
                    long P=extract(arr,size--);
                    long Q=extract(arr,size--);
                    long opt=(P*3-Q*2)%mod;
                    insert(arr,++size,opt);
                    //build(arr,size);
                }

            }
            System.out.println(arr[1]);

        }
    }
    static void max_heap(long[] arr, int i,int size){
        if(isLeaf(i,size)) return;
        int right=i*2+1;
        int left=i*2;
        if(right<=size){
            if(arr[i]>=arr[right]&&arr[i]>=arr[left]) return;
        }
        else{
            if(left<=size&&arr[i]>=arr[left]) return;
        }
        int largest=i;
        if(left<=size&&arr[largest]<arr[left]) largest=left;
        if(right<=size&&arr[largest]<arr[right]) largest=right;
        if(largest!=i) swap(arr,largest,i);
        max_heap(arr,largest,size);
    }
    static boolean isLeaf(int i,int size){
        if(i>size/2&&i<=size) return true;
        else return false;
    }
    static void swap(long[] arr,int i, int j){
        long temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void insert(long[] arr, int i,long value){
        arr[i]=value;
        int k=i;
        while(k>1&&arr[k]>arr[k/2]){
            swap(arr,k,k/2);
            k=k/2;
        }
    }
    static void build(long[] arr, int size){
        int non_leaf=size/2;
        for(int i=non_leaf;i>0;i--) max_heap(arr,i,size);
    }
    static long extract(long[] arr,int size){
        long temp=arr[1];
        swap(arr,1,size);
        max_heap(arr,1,size-1);
        return temp;
    }
}
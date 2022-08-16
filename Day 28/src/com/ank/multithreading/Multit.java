package com.ank.multithreading;
class Multit implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multit m1=new Multit();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}
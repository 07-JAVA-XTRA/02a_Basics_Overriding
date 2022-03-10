package com.cc.java;


public class App {
    
    public static void main(String[] args) {
     
        Child child = new Child("John");
        Child child2 = new Child("Mary");
        Child child3 = new Child("Maria"); 

        System.out.println(child);
        System.out.println(child2);
        System.out.println(child3);
        
        System.out.println(child.getName());
        System.out.println(child2.getName());
        System.out.println(child3.getName());
      

        


    }

}


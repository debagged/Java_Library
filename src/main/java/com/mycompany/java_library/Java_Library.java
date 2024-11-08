package com.mycompany.java_library;
//@author gelo
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Java_Library {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        clear_functions.clear_screen(4000);
        System.out.println("LIBRARY APPLICATION APP!");

       
       while(true){
            System.out.print("Enter your Position>> ");
            int choice = scan.nextInt();
        
            switch(choice){
                case 1:
                    System.out.println("Hello Admin");
                    break;
                case 2:
                    System.out.println("Hello Student");
                    break;
                default:
                    System.out.println("Please try again!");
                    continue;
            }
            break;
 
       }
    }
}




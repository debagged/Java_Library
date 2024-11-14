package com.mycompany.java_library;
//@author gelo
import java.util.*;


public class Java_Library{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        Functions.clear_screen(3000);
        System.out.println("LIBRARY APPLICATION APP!");

    
       while(true){
            System.out.println("Select Status\n" 
                             + "1.Librarian\n"
                             + "2.Student");
            System.out.print("Enter your Position: ");
            int choice = scan.nextInt();
        
            switch(choice){
                case 1:
                    Functions.clear_screen(3000);
                    System.out.println("Hello Admin");
                    break;
                case 2:
                    Functions.clear_screen(3000);
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




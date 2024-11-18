package com.mycompany.java_library;
//@author gelo

import java.util.*;

import com.mycompany.java_library.screen_functions.*;
import com.mycompany.java_library.users.Users;
import com.mycompany.java_library.users.Users.Librarian;;


public class Java_Library{
    static Scanner scan = new Scanner(System.in);
    static Users user = new Users();
    static Librarian librarian = new Librarian();

    
    public static void main(String[] args) throws Exception{
        Functions.clear_screen(3000);
        System.out.println("LIBRARY APPLICATION APP!");
        Thread.sleep(3000);

       while(true){ 
            System.out.println("Select Status\n" 
                             + "1.Librarian\n"
                             + "2.Student");
            System.out.print("Enter your Position: ");
        
            try {
                int choice = scan.nextInt();

                switch(choice){
                    case 1:
                        librarian.register_Librarian();
                        Functions.clear_screen(3000);
                        System.out.println("Hello Admin");
                        break;
                    case 2:
                        Functions.clear_screen(3000);
                        System.out.println("Hello Student");
                        break;
                    default:        
                        System.out.println("\nPlease try again!, Input is no in the option");
                        Functions.clear_screen(3000);
                        continue;
                }
                break;

            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("E: Input is not in the option, Try Again.");
                scan.nextLine();
                Functions.clear_screen(3000);
 
            }
       }
    }
}




package com.mycompany.java_library;
//@author gelo

import java.util.*;

import com.mycompany.java_library.screen_functions.*;
import com.mycompany.java_library.users.UserData;
import com.mycompany.java_library.users.Admin.Librarian;
import com.mycompany.java_library.library_function.libraryFunctions;

public class Java_Library{
    static Scanner scan = new Scanner(System.in);
    static UserData user = new UserData();

    
    public static void main(String[] args) throws Exception{
        Functions.clear_screen(3000);
        System.out.println("LIBRARY APPLICATION APP!");
        Thread.sleep(3000);

       while(true){ 
            System.out.println("Select Roles\n" 
                             + "1.Librarian\n"
                             + "2.Student");
            System.out.print("Enter your Role: ");
        
            try {
                int role = scan.nextInt();

                switch(role){
                    case 1 -> {
                        // Librarian

                    }

                    case 2 -> {
                        // Student

                    }

                    case 3 -> {

                    }
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



 
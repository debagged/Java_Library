package com.mycompany.java_library.users;

import java.util.Scanner;

public class Users {
    static Scanner scan = new Scanner(System.in);

    protected String first_name = "",
                     last_name = "",
                     user_ID = "",
                     user_name = "", 
                     password = "";


    public void Data(String first_name, 
                     String last_name, 
                     String user_name,
                     String password){

            this.first_name = first_name;
            this.last_name = last_name;
            this.user_name = user_name;
            this.password = password;
    }

    public void register_prompt(){

        System.out.print("Enter Given Name: ");
        this.first_name = scan.nextLine();

        System.out.print("Enter Last Name: ");
        this.last_name = scan.nextLine();

        System.out.print("Enter Username: ");
        this.user_name = scan.nextLine();

        System.out.print("Enter Password: ");
        this.password = scan.nextLine();
    }

    public void login_prompt(){
        System.out.print("Enter Username: ");
        this.user_name = scan.nextLine();

        System.out.print("Enter Password: ");
        this.password = scan.nextLine();
    }

    public static class Librarian extends Users {
        private String librarianCode;

        public void register_Librarian(){
            register_prompt();
            System.out.print("Enter Librarian ID: ");
            librarianCode = scan.next();
            
            System.out.println("\nLibrarian Information: "+ first_name +" "+ last_name +"\n" +
                            "Library Code: " + librarianCode);
            
        }
    }
}



class Student extends Users{
    private String studentID;

    public void register_Student(){
        register_prompt();
        System.out.print("Enter Librarian ID: ");
        studentID = scan.next();
        
        System.out.println("\nLibrarian Information: " + first_name +" "+ last_name +"\n" +
                        "Library Code: " + studentID);
        
    }
}



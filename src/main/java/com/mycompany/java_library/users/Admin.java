package com.mycompany.java_library.users;

public class Admin{
    public static class Librarian extends UserData {
        private String librarianCode;

        // public void register_Librarian(){
        //   try {
        //     register_prompt();
        //     System.out.print("Enter Librarian ID: ");
        //     librarianCode = scan.next();
            
        //     System.out.println("\nLibrarian Information: "+ first_name +" "+ last_name +"\n" +
        //                     "Library Code: " + librarianCode);
            
        //   } 
        //   catch (Exception err) {
        //     err.printStackTrace();
        //     }
        // }


        public static void main(String[] args) {
          System.out.println("Welcome, Admin!!");

          while(true){
            System.out.println("Do you have any Accounts? [No, Register] [Yes, LogIn]\n" 
                              + "1. Log In\n"
                              + "2. Register\n"
                              + "3. Exit");
            System.out.print("Enter Choice: ");

            try {
              int choice  = scan.nextInt();

              switch (choice) {
                case 1 -> {
                  // login
                }

                case 2 -> {
                  //register     
                }
                  
              
              }
            } catch (Exception err) {}
          }

        }
    }
}



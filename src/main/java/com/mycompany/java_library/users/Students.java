package com.mycompany.java_library.users;

public class Students{

    public static class Student extends UserData{
        private String studentID;

        public void register_Student(){
            try {
                register_prompt();
                System.out.print("Enter Student ID: ");
                studentID = scan.next();
                
                System.out.println("\nStudent Information: " + first_name +" "+ last_name +"\n" +
                                "Library Code: " + studentID);
                
            } catch (Exception err) {
                err.printStackTrace();
            }
        }
    }


}

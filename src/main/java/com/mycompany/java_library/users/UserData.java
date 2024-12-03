package com.mycompany.java_library.users;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import com.mycompany.java_library.library_function.*;
import com.mycompany.java_library.screen_functions.*;

    public class UserData {
        static Scanner scan = new Scanner(System.in);
        static HashMap<String, String> userDataBase = new HashMap<>();
        
        static libraryFunctions libraryFuncs = new libraryFunctions();
        static Functions screen = new Functions();

        protected String first_name = "",
                        last_name = "",
                        user_ID = "",
                        user_name = "", 
                        password = "";
        
                        
        public void register_prompt() throws IOException, InterruptedException{

            System.out.print("Enter Given Name: ");
            first_name = scan.nextLine();

            System.out.print("Enter Last Name: ");
            last_name = scan.nextLine();

            System.out.print("Enter Username: ");
            user_name = scan.nextLine();

            System.out.print("Enter Password: ");
            password = scan.nextLine();

            userDataBase.put(user_name, password);
            Functions.clear_screen(200);

            saveDataToFile(user_name, password);
            
            
        }

        public void login_prompt(){
            while(true){
                System.out.print("Enter Username: ");
                user_name = scan.nextLine();

                System.out.print("Enter Password: ");
                password = scan.nextLine();

                // String storedPassword = userDataBase.get(user_name);

                // if(storedPassword != null && storedPassword.equals(password)){
                //     System.out.println("Login Successfully");
                //     break;
                // }
            
                // else{
                //     System.out.println("Wrong Username or Password");
                // }

                readDataFromFile(user_name, password);
                break;

            }
        }

        private void saveDataToFile(String user_name, String password){
            try (FileWriter fw = new FileWriter("userdata.txt", true);
                    PrintWriter pw = new PrintWriter(fw)) {
                    for (Map.Entry<String, String> entry : userDataBase.entrySet()) {
                        pw.println(entry.getKey() + ":" + entry.getValue());
                    }
                    } catch (IOException e) {
                e.printStackTrace();
            }       
        }

        private void readDataFromFile(String username, String password){
            try(BufferedReader br = new BufferedReader(new FileReader("userdata.txt"))){
                String line = br.readLine();
                String[] parts = line.split(":");
                username = parts[0];
                password = parts[1];

                if(username == parts[0] && password == parts[1]){
                    System.out.println("Login Successfully");
                }
                else{
                    System.out.println("Wrong Username or Password");
                }

            }catch (IOException err) {
                err.printStackTrace();
            }


        }
    }



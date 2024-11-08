package com.mycompany.java_library;


public class clear_functions{

    public static void clear_screen(int time_milli) throws InterruptedException{
        System.out.print("\033c");
        Thread.sleep(time_milli);;
    }
    
}

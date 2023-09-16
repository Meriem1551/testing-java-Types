package org.types;

import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //primitive types:

        int age =  19;
        long num = 3_123_456_789L;
        // java see this number as integer,so we add L at the end;
        float price = 10.99F;
        // java see this number as double ,so we add F at the end;
        char ch = 'A';
        boolean bl = false;

       // Reference type:
        Date now = new Date();
        System.out.println(now);

        //Strings:
        String message1 = new String("Hello world");
        // or
        String message2 = "This a shortcut";
        System.out.println(message1);
        System.out.println(message2);
        String message3 = "I'm" + "Meriem";
        String tolower = message3.toLowerCase();
        System.out.println( message3.endsWith("m"));
        System.out.println(message1.indexOf("he"));
        System.out.println(message1.replace("wo", "Wo"));
        System.out.println(message1); //the previous variable never change
        System.out.println(message1.trim());// remove white space at the beginning of a string

        //adding  "" inside a string:
        String message4 = "Hello \" Meriem \"";
        // adding \:
        String message5 = "c:\\windows\\...";
        // \n: back to line :
    }
}
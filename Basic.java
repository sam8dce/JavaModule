package com.sam8dce.javaapp;//

import java.util.Scanner;

public class Main {//
    public static void main(String[] args) {//
        System.out.println("Java Basics");
        //string int float{add f at last} boolean double
        // char x='a'//single char  '\u02b9'
        //string interpolation print(str1+"hello"+str2..)
        ///Main5f5ce1111e155225.java:6: error: incompatible types: possible lossy conversion from double to float
        //float gdp=2.454;
        // bool char byte short int long float double
        // 1 bit 2 byte 1 2 4 8 4 8 bytes
        //string not a primitive data type

        //type conversions implicit nd explicity
        //int to double impli double to int explicit
        //implicit
        int r=400;
        double newRad=r;
        //explicit
        double dia=5.6;
        int newDia=(int) dia;
        //USer input
        int pop;
        Scanner sc= new Scanner(System.in);
        pop=sc.nextInt();//nextLine to store whole string separated by spaces.
        //next().charAt(0);for character
        sc.close();//memory wastage
        //operator precedence LtoR associativity * / & > + -
        //

    }

    public void arrayfunc(){
        float[] myarr=new float[2];//contains 2 elems.
        for(float i:myarr){
            System.out.println(i);//prints each char
        }
        int[] myarr2={{3,4},{5,7}};
        for (int row =0;row<myarr2.length;row++){
            for(int col=0;col<marr2[row].length;col++){
                //myarr2[row][col];
            }
        }
    }
    public void stringfunc(){
        Scanner sc=new Scanner(System.in);//Scanner class sc is ref vairiable stored in stack memory and new keyword createsinstance of class created in heap(runtime)
        String myString = "Welcome";
       // Strings are case sensitive i.e. "HELLO" is not equal to "hello". So if you need to compare Strings irrespective of their cases then use
        myString.equalsIgnoreCase("WeLCOme")); // returns true
        //An empty String is represented by
        String str = ""; 
        //To check if a String is empty or not, use str.isEmpty() 
        System.out.println(str.isEmpty()); // returns true
        //To get the index of a particular character present in a String use
        myString.indexOf('c'); // returns 3
        //To Remove blank space if present at the beginning or at the end of string use
        myString.trim();

        String s1="Welcome";
        String s2="Welcome";//string creation using literal
        String s3=new String("Welcome");
        s1==s2//true as both are same objevts
        s1==s3//false as new intilisations are done in String Pool of heap memory.so diff objects.
        s1.equal(s3);//true beacuse values of objects are being compared.


    }
    //method overload same names but different parameters.
    //making change in return type doesnot come in concept of m.overload.
    public void exception(){
    try{
        
    }
    catch(Exception1 e1 | Exception2 e2){ //or Exception e
        //catch all
        null.length();//throws null ptr exception.

    }
    finally{
        //always executed
    }
}
}
//.java -{run button} --> .class file byte codes forms a .exe and application runs compile time handled by jdk.
//jre-jvm- app runs ---> runtime  handled by jre.

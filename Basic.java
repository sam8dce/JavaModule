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
}
//.java -{run button} --> .class file byte codes forms a .exe and application runs compile time handled by jdk.
//jre-jvm- app runs ---> runtime  handled by jre.

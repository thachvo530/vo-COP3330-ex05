/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String num1 = scan.next();

        System.out.print("What is the second number? ");
        String num2 = scan.next();

        int numone = Integer.parseInt(num1);
        int numtwo = Integer.parseInt(num2);

        int sum = numone + numtwo;
        int difference = numone - numtwo;
        int product = numone * numtwo;
        int quotient = numone / numtwo;

        System.out.print(""+num1+" + "+num2+" = "+sum+"\n"+num1+" - "+num2+" = "+difference+"\n"+num1+" * "+num2+" = "+product+"\n"+num1+" / "+num2+" = "+quotient+"");



    }
}

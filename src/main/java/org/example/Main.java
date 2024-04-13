package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want to calculate power");
        int powerOfNumber = sc.nextInt();
        System.out.println("Enter Number to you want to power raised to");
        int powerRaisedto = sc.nextInt();

        Powerfinder powerFinderObject = new Powerfinder();

        powerFinderObject.setFindPower(powerOfNumber, powerRaisedto);

        int result = powerFinderObject.getFindPower();

        System.out.println("Power of number " + powerOfNumber + " raised to " + powerRaisedto +" is "+ result );




    }
}
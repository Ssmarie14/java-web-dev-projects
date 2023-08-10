package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Give me a radius:");
double first = input.nextInt();
double result = Circle.getArea(first);
        System.out.println(result);
    }
}

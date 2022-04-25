package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;

        do {
            System.out.print("number = ");
            number = scanner.nextDouble();
        }
        while (number < 0);

        double result = Math.sqrt(number);

        System.out.println("result = " + result);
    }
}

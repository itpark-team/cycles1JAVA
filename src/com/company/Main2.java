package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("number = ");
        int number = scanner.nextInt();

        System.out.print("startNum = ");
        int startNum = scanner.nextInt();

        System.out.print("finishNum = ");
        int finishNum = scanner.nextInt();

        System.out.print("step = ");
        int step = scanner.nextInt();

        int i = startNum;

        while (i <= finishNum) {
            System.out.println(number + " * " + i + " = " + number * i);
            i += step;
        }
    }
}

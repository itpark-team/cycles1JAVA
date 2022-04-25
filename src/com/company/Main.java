package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRepeat;

        System.out.print("countRepeat = ");
        countRepeat = scanner.nextInt();

        int i = 0;//0 1 2 < 3

        while (i < countRepeat) {
            System.out.println("hello world");//algo
            i++;
        }
    }
}

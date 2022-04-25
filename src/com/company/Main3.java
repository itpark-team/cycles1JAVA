package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;

        do {
            System.out.print("дошёл?? (1-да, 0-нет): ");
            answer = scanner.nextInt();
        } while (answer != 1);
    }
}

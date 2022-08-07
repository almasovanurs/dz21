package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("day of the weer");
        try {
            DayOfTheWeer day = DayOfTheWeer.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
            System.out.println(day);
        }catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }



    }
}
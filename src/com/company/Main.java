package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String day=scanner.next();

        Days days  = Days.valueOf(day);

        switch (days){
            case MONDAY -> System.out.println("Дуйшомбу куну Жава окуйм");
            case TUESDAY -> System.out.println("Шейшемби куну Англис тилин окуйм");
            case WEDNESDAY -> System.out.println("Шаршемби куну практика кылам");
            case THURSDAY -> System.out.println("Бейшемби куну кайра жава окуйм");
            case FRIDAY -> System.out.println("Жума куну англис тилин окуйм");
            case SATURDAY -> System.out.println("Ишемби куну эс алам");
            case SUNDAY -> System.out.println("Жекшемби куну футбол ойнойм");
        }


    }
}

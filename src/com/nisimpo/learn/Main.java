package com.nisimpo.learn;

import java.lang.String;
import java.util.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {"Register", "List All"};

        byte age = 0;
        int i = 0;
        byte choice = 0;

        List<Person> personList = new ArrayList<Person>();


        while (true) {
            System.out.println("Choose Option Below By Writing Its Number");
            for (i = 0; i < menu.length; i++) {
                System.out.println(i + 1 + ". " + menu[i]);
            }
            choice = scanner.nextByte();
            if (menu[choice - 1].equals("Register")) {
                System.out.println("Please Enter Your Name");
                String name = scanner.next();
                System.out.println("Ok " + name + " Enter Your Age");
                age = scanner.nextByte();
                Person newPerson = new Person(name, age);
                personList.add(newPerson);

            } else if (menu[choice - 1].equals("List All")) {
                System.out.println("Name Age");
                System.out.println("-----------------");
                for (Person item : personList) {

                    System.out.println(item.name + " |" + item.age);
                }
                System.out.println("-----------------");
            }


        }
    }
}

package org.example;

import Animals.Animal;
import Animals.Dog;
import Animals.HomeCat;
import Animals.Tiger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> al = new ArrayList<>();
        Terminal t = new Terminal(scanner, al);
        t.start();
    }

}
package org.example;

import Animals.Animal;
import Animals.Dog;
import Animals.HomeCat;
import Animals.Tiger;

import java.util.ArrayList;
import java.util.Scanner;

public class Terminal {

    Scanner sc;
    ArrayList<Animal> al;
    String newLine;

    public Terminal(Scanner scanner, ArrayList<Animal> al){
        this.sc = scanner;
        this.al = al;
    }

    public void start(){
        System.out.println("Можете начать работать. Напечатайте 'help' для просмотра списка команд");
        while (true){
            newLine = sc.nextLine();
            commandManager(newLine);
        }
    }


    public void commandManager(String newLine){

            switch (newLine){
                case "help":
                    System.out.println("help  : вывести справку по доступным командам\n"+
                                       "add   : добавить животное\n"+
                                       "clear : очистить массив\n" +
                                       "start : запустить соревнование\n"+
                                       "exit  : выйти из программы\n");
                    break;
                case "exit":
                    System.out.println("До свидания");
                    al.clear();
                    System.exit(0);
                    break;
                case "add":
                    System.out.println("Введите тип животного");
                    switch (sc.nextLine()) {
                        case "собака":
                            System.out.println("Введите имя животного");
                            //Animal dog = new Dog(sc.nextLine());
                            al.add(new Dog(sc.nextLine()));
                            System.out.println("Запись добавлена");
                            break;
                        case "кот":
                            System.out.println("Введите имя животного");
                            //Animal cat = new HomeCat(sc.nextLine());
                            al.add(new HomeCat(sc.nextLine()));
                            System.out.println("Запись добавлена");
                            break;
                        case "тигр":
                            System.out.println("Введите имя животного");
                            //Animal tiger = new Tiger(sc.nextLine());
                            al.add(new Tiger(sc.nextLine()));
                            System.out.println("Запись добавлена");
                            break;
                        default:
                            System.out.println("Нет такого животного");
                            break;

                    }
                    break;

                case "start":
                    if (al.isEmpty()) System.out.println("Команда из животных пустует");
                    else
                        for (Animal a : al) {
                            System.out.println("Введите дистанцию забега");
                            System.out.println("Введите дистанцию заплыва");
                            a.run(sc.nextInt());
                            a.swim(sc.nextInt());
                        }
                    break;
                case "clear":
                    al.clear();
                    System.out.println("Массив очищен");
                    break;
                default:
                    System.out.println("Неизвестная команда, напечатайте 'help' для просмотра списка команд");
                    break;
            }
        }
    }



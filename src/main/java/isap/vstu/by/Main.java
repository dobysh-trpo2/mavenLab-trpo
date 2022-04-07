package lab5;

import java.nio.file.*;
import java.io.IOException;
import java.nio.file.Files;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Customer group[] = new Customer[10];
        int groupsize = 2;
        
        Scanner cScanner = new Scanner(System.in);
        int userInput;
        int min;
        int max;
        String data = new String(Files.readAllBytes(Paths.get("Group.txt")));
        Scanner inScanner = new Scanner(data);
        
        for (int i = 0; i < groupsize; i++) {
            group[i] = new Customer(inScanner);
        }
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Выберите действие");
            System.out.println("1) Вывести полный список покупателей");
            System.out.println("2) Вывести список покупателей по номеру кредитной карты");
            System.out.println("3) Найти по критерию");
            System.out.println("4) Выйти");
            userInput = cScanner.nextInt();
            
            switch (userInput) {
                case 1: {
                    for (int i = 0; i < groupsize; i++) {
                        System.out.println(group[i].toString() + "\n");
                    }
                    break;
                }
                case 2: {
                    
                    System.out.println("Введите интервал");
                    min = cScanner.nextInt();
                    max = cScanner.nextInt();
                    for (int i = 0; i < groupsize; i++) {
                        if (group[i].creditCardNumber >= min && group[i].creditCardNumber <= max) {
                            System.out.println(group[i].toString());
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Выберите критерий");
                    System.out.println("1) имя");
                    System.out.println("2) фамилия");
                    System.out.println("3) отчество");
                    System.out.println("4) адресс");
                    System.out.println("5) номер кредитной карты");
                    System.out.println("6) номер банковского счёта");
                    userInput = cScanner.nextInt();
                    break;
                }
                case 4: {
                    isRunning = false;
                    break;
                }
            }
            
        } 
    
    }

}

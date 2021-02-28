package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                Scanner num = new Scanner(System.in);
                Random rand = new Random();
                int  number2;
                for (int i = 0; i < 100; i++) {
                    int number = rand.nextInt(100);
                    System.out.println(number);

                    while (true) {
                        System.out.println("введите число : ");
                        number2 = num.nextInt();

                        if (number2 >= number) {
                            System.out.println("Введенное вами число больше того, что загадал компьютер");
                        }
                        if (number2 <= number) {
                            System.out.println("Введенное вами число меньше того, что загадал компьютер");
                            if (number2 == number) {
                                System.out.println("Вы угадали!");
                                break;
                            }
                        }
                    }
                }
            }
        }

	// write your code here


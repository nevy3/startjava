package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
                // write your code here
                Scanner scan = new Scanner(System.in);
                int number1, number2, result;

                System.out.println("1. +");
                System.out.println("2. -");
                System.out.println("3. *");
                System.out.println("4. /");
                System.out.println("5. ^");
                System.out.println("6. %");
                System.out.println("Введите операцию(+, -, *, /, ^, %): ");
                int op = scan.nextInt();

                if (op == 1) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    result = number1 + number2;
                    System.out.println(result);
                }
                if (op == 2) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    result = number1 - number2;
                    System.out.println(result);
                }
                if (op == 3) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    result = number1 * number2;
                    System.out.println(result);
                }
                if (op == 4) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    result = number1 / number2;
                    System.out.println(result);
                }
                if (op == 5) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    System.out.println(Math.pow(number1,number2));
                }
                if (op == 6) {
                    System.out.println("Введите первое число:");
                    number1 = scan.nextInt();
                    System.out.println("Введите второе число:");
                    number2 = scan.nextInt();
                    result = number1 % number2;
                    System.out.println(result);
                } else if (op > 6) {
                    System.out.println("Неверная операция:");
                }
            }
        }
	// write your code here


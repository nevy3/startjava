package com.company;
import java.util.Random;
public class Main {
        public static void main(String[] args) {
            Random rand_char = new Random();
            int number = 10178;
            int unicode = rand_char.nextInt(number) + 9398;
            char smile = (char) (unicode);
            System.out.println(unicode);
            System.out.println(smile);
            // write your code here
        }
    }
	// write your code here


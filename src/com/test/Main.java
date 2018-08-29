package com.test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("A.txt", "r")) {
            int number = file.readInt();
            System.out.println("The number is " + number);
        }

        try (RandomAccessFile file = new RandomAccessFile("B.txt", "r")) {
            int number1 = file.readInt();
            int number2 = file.readInt();
            System.out.println("The first number is " + number1);
            System.out.println("The second number is " + number2);
        }
    }
}

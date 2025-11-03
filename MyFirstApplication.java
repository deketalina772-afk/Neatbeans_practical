/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.myfirstapplication;

/**
 *
 * @author user
 */
import java.io.*;

public class MyFirstApplication {

    // Метод для зчитування рядка
    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    // Метод для зчитування дійсного числа
    public static float getFloat() throws IOException {
        while (true) {
            try {
                String s = getString();
                return Float.parseFloat(s);
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть дійсне число:");
            }
        }
    }

    // Метод для зчитування цілого числа
    public static int getInt() throws IOException {
        while (true) {
            try {
                String s = getString();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Помилка! Введіть ціле число:");
            }
        }
    }

    // Метод порівняння двох чисел
    public static void compareNumbers(float a, float b) {
        if (a > b)
            System.out.println(a + " більше за " + b);
        else if (a < b)
            System.out.println(a + " менше за " + b);
        else
            System.out.println("Числа рівні");
    }

    // Арифметичні методи
    public static float sum(float a, float b) {
        return a + b;
    }

    public static float dif(float a, float b) {
        return a - b;
    }

    public static float multi(float a, float b) {
        return a * b;
    }

    public static float div(float a, float b) {
        if (b == 0) {
            System.out.println("Ділення на нуль неможливе!");
            return 0;
        }
        return a / b;
    }

    // Метод збільшення суми і різниці у циклі
    public static void increaseByLoop(int a, int b) {
        int s = a + b;
        int d = a - b;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ітерація " + i + ": сума = " + (s * i * 10) + ", різниця = " + (d * i * 5));
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введіть перше число:");
        float a = getFloat();

        System.out.println("Введіть друге число:");
        float b = getFloat();

        System.out.println("\nПорівняння чисел:");
        compareNumbers(a, b);

        System.out.println("\nСума = " + sum(a, b));
        System.out.println("Різниця = " + dif(a, b));
        System.out.println("Множення = " + multi(a, b));
        System.out.println("Ділення = " + div(a, b));

        System.out.println("\nТестуємо цикл збільшення суми та різниці:");
        increaseByLoop((int) a, (int) b);
    }
}
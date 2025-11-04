/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reverse;

/**
 *
 * @author user
 */
import java.io.*;

public class ReverserApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while (true) {
            System.out.print("Введіть рядок: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) break;

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Перевернутий рядок: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
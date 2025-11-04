/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reverse;

/**
 *
 * @author user
 */
class BracketChecker {
    private String input;

    public BracketChecker(String in) {
        input = in;
    }

    public void check() {
        StackX theStack = new StackX(input.length());

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') ||
                            (ch == ']' && chx != '[') ||
                            (ch == ')' && chx != '(')) {
                            System.out.println("Помилка: " + ch + " на позиції " + j);
                        }
                    } else {
                        System.out.println("Помилка: " + ch + " на позиції " + j);
                    }
                    break;
            }
        }

        if (!theStack.isEmpty()) {
            System.out.println("Помилка: незакриті дужки");
        } else {
            System.out.println("Дужки розставлені правильно");
        }
    }
}
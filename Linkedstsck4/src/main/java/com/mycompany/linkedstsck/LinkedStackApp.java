/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedstsck;

/**
 *
 * @author user
 */
public class LinkedStackApp {
    public static void main(String[] args) {
        LinkedStack theStack = new LinkedStack();

        theStack.push(20);
        theStack.push(40);
        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);
        theStack.displayStack();

        theStack.pop();
        theStack.pop();
        theStack.displayStack();
    }
}
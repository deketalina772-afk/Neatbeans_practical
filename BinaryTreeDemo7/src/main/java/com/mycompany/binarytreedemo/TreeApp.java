/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreedemo;

/**
 *
 * @author user
 */
public class TreeApp {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        theTree.insert(33, 1.2);
        theTree.insert(87, 1.7);
        theTree.insert(93, 1.5);
        theTree.insert(97, 1.5);

        System.out.print("In-order traversal: ");
        theTree.traverseInOrder(theTree.getRoot());
        System.out.println();

        Node found = theTree.find(43);
        System.out.println("Пошук 43: " + (found != null ? "Знайдено" : "Не знайдено"));

        Node min = theTree.findMin();
        System.out.println("Мінімальне значення: " + min.id);

        Node max = theTree.findMax();
        System.out.println("Максимальне значення: " + max.id);

        DisplayTree dt = new DisplayTree();
        dt.displayTree(theTree.getRoot());
    }
}

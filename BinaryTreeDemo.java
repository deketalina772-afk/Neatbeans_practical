/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytreedemo;

/**
 *
 * @author user
 */
public class BinaryTreeDemo {
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

        System.out.println("Пошук 43: " + (theTree.find(43) != null ? "Знайдено" : "Не знайдено"));
        System.out.println("Мінімальне значення: " + theTree.findMin().id);
        System.out.println("Максимальне значення: " + theTree.findMax().id);

        DisplayTree dt = new DisplayTree();
        dt.displayTree(theTree.getRoot());
    }
}
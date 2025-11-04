/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortalgorithms;

public class SelectSortApp {
    public static void main(String[] args) {
        ArraySel arr = new ArraySel(20);
        arr.generateRandom(10, 100); // 10 випадкових чисел до 100

        System.out.println("Масив до сортування:");
        arr.display();

        arr.selectSort();

        System.out.println("Масив після сортування вибором:");
        arr.display();
    }
}

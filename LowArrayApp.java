/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lowarrayproject;

/**
 *
 * @author user
 */
public class LowArrayApp {
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 10;

        long[] values = {87, 45, 75, 63, 45, 99, 45, 23, 45, 12};
        for (int i = 0; i < nElems; i++) {
            arr.setElem(i, values[i]);
        }

        System.out.print("Масив: ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println();

        long searchKey = 45;
        int count = arr.countOccurrences(searchKey, nElems);
        System.out.println("Кількість елементів, рівних " + searchKey + ": " + count);

        for (int i = 0; i < nElems; i++) {
            if (arr.getElem(i) == searchKey) {
                arr.deleteElem(i, nElems);
                nElems--;
                break;
            }
        }

        System.out.print("Масив після видалення першого " + searchKey + ": ");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr.getElem(i) + " ");
        }
        System.out.println();
    }
}
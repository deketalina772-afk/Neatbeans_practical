/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pr_8;

/**
 *
 * @author user
 */
public class HashTableApp {
    public static void main(String[] args) {
        int size = 10;
        int n = 5;
        int keysPerCell = 10;

        System.out.println("Створення хеш-таблиці розміром " + size);
        HashTable theHashTable = new HashTable(size);

        // Автоматичне заповнення випадковими значеннями
        System.out.println("Автоматичне заповнення " + n + " випадковими елементами:");
        for (int j = 0; j < n; j++) {
            int aKey = (int)(Math.random() * keysPerCell * size);
            System.out.println("  Вставка: " + aKey);
            theHashTable.insert(new DataItem(aKey));
        }

        // Ручна вставка (автоматично)
        int[] manualKeys = {23, 45, 67, 89};
        System.out.println("Ручна вставка ключів: 23, 45, 67, 89");
        for (int key : manualKeys) {
            System.out.println("  Вставка: " + key);
            theHashTable.insert(new DataItem(key));
        }

        // Показ таблиці
        System.out.println("\nПоточна таблиця:");
        theHashTable.displayTable();
        System.out.println("Середній розмір групи: " + theHashTable.calculateAverageGroupSize());

        // Пошук
        int searchKey = 67;
        System.out.println("\nПошук ключа: " + searchKey);
        DataItem found = theHashTable.find(searchKey);
        if (found != null)
            System.out.println("  Знайдено: " + searchKey);
        else
            System.out.println("  Не знайдено: " + searchKey);

        // Видалення
        int deleteKey = 45;
        System.out.println("\nВидалення ключа: " + deleteKey);
        theHashTable.delete(deleteKey);

        // Показ після видалення
        System.out.println("\nТаблиця після видалення:");
        theHashTable.displayTable();
    }
}
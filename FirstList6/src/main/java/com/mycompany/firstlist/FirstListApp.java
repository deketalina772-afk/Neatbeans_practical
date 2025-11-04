/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstlist;

/**
 *
 * @author user
 */
public class FirstListApp {
    public static void main(String[] args) {
        FirstList theList = new FirstList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.displayList(); // Вивід списку

        theList.deleteFirst(); // Видалення першого
        theList.deleteFirst(); // Видалення другого

        theList.displayList(); // Повторний вивід
    }
}

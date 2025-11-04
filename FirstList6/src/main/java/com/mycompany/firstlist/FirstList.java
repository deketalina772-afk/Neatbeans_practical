/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstlist;

/**
 *
 * @author user
 */
public class FirstList {
    private Link first; // Посилання на перший елемент

    public FirstList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("Список (з першого до останнього): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstlist;

/**
 *
 * @author user
 */
public class Link {
    public long dData; // Дані елемента
    public Link next;  // Посилання на наступний елемент

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print("{" + dData + "} ");
    }
}

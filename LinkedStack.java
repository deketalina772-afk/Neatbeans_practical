/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedstsck;

/**
 *
 * @author user
 */
public class LinkedStack {
    private LinkList theList;

    public LinkedStack() {
        theList = new LinkList();
    }

    public void push(long j) {
        theList.insertFirst(j);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void displayStack() {
        System.out.print("Stack (top --> bottom): ");
        theList.displayList();
    }
}

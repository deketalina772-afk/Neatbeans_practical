/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queuelab;

/**
 *
 * @author user
 */
public class PriorityQ {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0) {
            queArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (item > queArray[j])
                    queArray[j + 1] = queArray[j];
                else
                    break;
            }
            queArray[j + 1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}

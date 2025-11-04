/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lowarrayproject;

/**
 *
 * @author user
 */
class LowArray {

    private long[] a;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElem(int index, long value) {
        a[index] = value;
    }

    public long getElem(int index) {
        return a[index];
    }

    public void deleteElem(int index, int nElems) {
        for (int i = index; i < nElems - 1; i++) {
            a[i] = a[i + 1];
        }
    }

    public int countOccurrences(long value, int nElems) {
        int count = 0;
        for (int i = 0; i < nElems; i++) {
            if (a[i] == value) {
                count++;
            }
        }
        return count;
    }
}

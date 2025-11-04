/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortalgorithms;

/**
 *
 * @author user
 */
import java.util.Random;

public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void generateRandom(int count, int bound) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            insert(rand.nextInt(bound));
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    public void selectSort() {
        for (int out = 0; out < nElems - 1; out++) {
            int min = out;
            for (int in = out + 1; in < nElems; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

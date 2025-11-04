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

public class ArrayHub {
    private long[] a;
    private int nElems;

    public ArrayHub(int max) {
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

    public void bubbleSort() {
        for (int out = nElems - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        }
    }
}

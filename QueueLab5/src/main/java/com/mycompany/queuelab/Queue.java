/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queuelab;

/**
 *
 * @author user
 */
public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }
}
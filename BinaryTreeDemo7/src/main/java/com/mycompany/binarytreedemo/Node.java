/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreedemo;

/**
 *
 * @author user
 */
public class Node {
    public int id;
    public double data;
    public Node left;
    public Node right;

    public Node(int id, double data) {
        this.id = id;
        this.data = data;
    }

    public void displayNode() {
        System.out.print("{" + id + ", " + data + "} ");
    }
}

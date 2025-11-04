/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreedemo;

/**
 *
 * @author user
 */
public class Tree {
    private Node root;

    public void insert(int id, double data) {
        Node newNode = new Node(id, data);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.id)
                return current;
            else if (key < current.id)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }

    public Node findMin() {
        Node current = root;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public Node findMax() {
        Node current = root;
        while (current.right != null)
            current = current.right;
        return current;
    }

    public void traverseInOrder(Node localRoot) {
        if (localRoot != null) {
            traverseInOrder(localRoot.left);
            localRoot.displayNode();
            traverseInOrder(localRoot.right);
        }
    }

    public Node getRoot() {
        return root;
    }
}
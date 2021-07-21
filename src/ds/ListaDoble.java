/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author ez
 */
public class ListaDoble<T> {

    private Node head;
    private Node tail;
    private int size;

    public ListaDoble() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(T data) {
        Node<T> newNode = new Node(data);
        newNode.setNext(head);
        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;

    }

    public void addToEnd(T data) {
        Node<T> newNode = new Node(data);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public Node removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public Node removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        Node removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        return removedNode;
    }

    public void printList() {
        Node current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            current = current.getNext();
            if (current != null) {
                System.out.print(" <=> ");
            }
        }
        System.out.println();
    }

}

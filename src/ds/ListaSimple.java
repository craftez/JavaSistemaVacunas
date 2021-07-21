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
public class ListaSimple<T> {
    private Node head;
    private int size;
    
    public ListaSimple() {
        size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }
    
    public void push(T data) {
        Node<T> node = new Node(data);
        node.setNext(head);
        head = node;
        size++;
    }
    
    public Node pop() {
        if (isEmpty()) return null;
        Node removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }
    
    public void clear() {
        Node current = head;
        while (current != null) {
            head = current.getNext();
        }
        head = null;
    }
    
    public void printList() {
        Node current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            current = current.getNext();
            if (current != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}

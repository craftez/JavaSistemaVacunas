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
    private Nodo head;
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
    
    public void addToFront(T data) {
        Nodo<T> node = new Nodo(data);
        node.setSiguiente(head);
        head = node;
        size++;
    }
    
    public Nodo removeFromFront() {
        if (isEmpty()) return null;
        Nodo removedNode = head;
        head = head.getSiguiente();
        removedNode.setSiguiente(null);
        size--;
        return removedNode;
    }
    
    public void printList() {
        Nodo current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            current = current.getSiguiente();
            if (current != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}

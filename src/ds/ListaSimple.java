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
    private Nodo cabeza;
    private int size;
    
    public ListaSimple() {
        size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return cabeza == null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
    
    public void addToFront(T data) {
        Nodo<T> node = new Nodo(data);
        node.setSiguiente(cabeza);
        cabeza = node;
        size++;
    }
    
    public Nodo removeFromFront() {
        if (isEmpty()) return null;
        Nodo removedNode = cabeza;
        cabeza = cabeza.getSiguiente();
        removedNode.setSiguiente(null);
        size--;
        return removedNode;
    }
    
    public void clear() {
        Nodo current = cabeza;
        while (current != null) {
            cabeza = current.getSiguiente();
        }
        cabeza = null;
    }
    
    public void printList() {
        Nodo current = cabeza;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            current = current.getSiguiente();
            if (current != null) System.out.print(" -> ");
        }
        System.out.println();
    }
}

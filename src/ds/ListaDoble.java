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
    private Nodo cabeza;
    private Nodo cola;
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
        return cabeza == null;
    }
    
    public void addToFront(T data) {
        Nodo<T> nodo = new Nodo(data);
        nodo.setSiguiente(cabeza);
        if (cabeza == null) {
            cola = nodo;
        } else {
            cabeza.setAnterior(nodo);
        }
        cabeza = nodo;
        size++;
        
    }
    
    public void addToEnd(T data) {
        Nodo<T> nodo = new Nodo(data);
        if (cola == null) {
            cabeza = nodo;
        } else {
            cola.setSiguiente(nodo);
            nodo.setAnterior(cola);
        }
        cola = nodo;
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
    
    public void printList() {
        Nodo current = cabeza;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            current = current.getSiguiente();
            if (current != null) System.out.print(" <=> ");
        }
        System.out.println();
    }
    
    
}

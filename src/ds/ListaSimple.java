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
    
    /**
     * Obtiene el valor de un nodo para la posición determinada
     * @param position para obtener el nodo
     */
    public T getValueAt(int position) {
        
        // Verifica si la posición ingresada se encuentre en el rango
        if (position >= 0 && position <= size) {
            if (position == 0) {
                return (T) head.getData();
            } else {
                // El nodo se debe insertar en algún lugar en medio de la lista
                Node aux = head;

                // Recorrer la lista hasta llegar a la posicion 
                // en la cual se insertara el nuevo nodo.
                for (int i = 0; i < ( position - 1); i++) {
                    aux = aux.getNext();
                }
                
                return (T) aux.getData();
            }
        }
        
        return null;
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

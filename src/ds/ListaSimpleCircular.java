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
public class ListaSimpleCircular<T> {
    private Node head;
    private Node tail;
    private int size;
    
    public ListaSimpleCircular() {
        size = 0;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return head == null && tail == null;
    }
    
    public Node getHead() {
        return this.head;
    }
    
    public Node getTail() {
        return this.tail;
    }
    
    /**
     * Agregar nuevo nodo al inicio de la lista
     * @param data valor del nodo
     */
    public void insertFirst(T data) {
        // Creamos el nuevo nodo
        Node<T> newNode = new Node(data);
        // Consultamos si la lista esta vacia
        if (isEmpty()) {
            // Asignamos el nodo a la cabeza
            head = newNode;
            // Asignamos el nodo a la cola
            tail = newNode;
        } else {
            // La lista no se encuentra vacia, unimos el nuevo nodo a la lista
            newNode.setNext(head);
            // Reasignamos cabeza al nuevo nodo
            head = newNode;
            
        }
        // Apuntamos el ultimo a la cabeza, para crear la lista circular
        tail.setNext(head);
        // Incrementamos el tamanno de la lista
        size++;
    }
    
    /**
     * Agregar nuevo nodo al final de la lista
     * @param data valor del nodo
     */
    public void insertLast(T data) {
        // Creamos el nuevo nodo
        Node<T> newNode = new Node(data);
        // Consultamos si la lista se encuentra vacia
        if (isEmpty()) {
            // Asignamos el nodo a la cabeza
            head = newNode;
            } else {
           // La lista no se encuentra vacia, unimos el nuevo nodo a la lista
           tail.setNext(newNode);
        }
        // Actualizamos el puntero cola al nuevo nodo
        tail = newNode;
        // Apuntamos el ultimo a la cabeza para crear lista circular
        tail.setNext(head);
    }
    
    /**
     * Insertar nodo después de posición.
     * @param position de referencia para insertar el nodo
     * @param data valor del nodo
     */
    public void insertAt(int position, T data) {
        // Validar si posición esta dentro del rango de la lista.
        if(position >= 0 && position <= size){
            // Si la posicion es al inicio de la lista
            if (position == 0) {
                insertFirst(data);
            } else {
                // Si la posicion del nodo es al final
                if (position == size) {
                    insertLast(data);
                } else {
                    // El nodo se debe insertar en algún lugar en medio de la lista
                    // Creamos el nuevo nodo
                    Node nuevo = new Node(data);
                    Node aux = head;
                    
                    // Recorrer la lista hasta llegar a la posicion 
                    // en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < ( position - 1); i++) {
                        aux = aux.getNext();
                    }
                    
                    // Une el nuevo nodo con el siguiente nodo de la lista.
                    nuevo.setNext(aux.getNext());
                    
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setNext(nuevo);
                    
                    // Incrementa el contador de tamaño de la lista.
                    size++;
                }
            }
        }
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
            } else if (position == size) {
                return (T) tail.getData();
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
}

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
    private Nodo cabeza;
    private Nodo cola;
    private int size;
    
    public ListaSimpleCircular() {
        size = 0;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return cabeza == null && cola == null;
    }
    
    public Nodo getCabeza() {
        return this.cabeza;
    }
    
    public Nodo getCola() {
        return this.cola;
    }
    
    /**
     * Agregar nuevo nodo al inicio de la lista
     * @param data valor del nodo
     */
    public void insertarPrimero(T data) {
        // Creamos el nuevo nodo
        Nodo<T> nuevo = new Nodo(data);
        // Consultamos si la lista esta vacia
        if (isEmpty()) {
            // Asignamos el nodo a la cabeza
            cabeza = nuevo;
            // Asignamos el nodo a la cola
            cola = nuevo;
        } else {
            // La lista no se encuentra vacia, unimos el nuevo nodo a la lista
            nuevo.setSiguiente(cabeza);
            // Reasignamos cabeza al nuevo nodo
            cabeza = nuevo;
            
        }
        // Apuntamos el ultimo a la cabeza, para crear la lista circular
        cola.setSiguiente(cabeza);
        // Incrementamos el tamanno de la lista
        size++;
    }
    
    /**
     * Agregar nuevo nodo al final de la lista
     * @param data valor del nodo
     */
    public void insertarAlFinal(T data) {
        // Creamos el nuevo nodo
        Nodo<T> nuevo = new Nodo(data);
        // Consultamos si la lista se encuentra vacia
        if (isEmpty()) {
            // Asignamos el nodo a la cabeza
            cabeza = nuevo;
            } else {
           // La lista no se encuentra vacia, unimos el nuevo nodo a la lista
           cola.setSiguiente(nuevo);
        }
        // Actualizamos el puntero cola al nuevo nodo
        cola = nuevo;
        // Apuntamos el ultimo a la cabeza para crear lista circular
        cola.setSiguiente(cabeza);
    }
    
    /**
     * Insertar nodo después de posición.
     * @param posicion de referencia para insertar el nodo
     * @param dato valor del nodo
     */
    public void insertarPorPosicion(int posicion, T dato) {
        // Validar si posición esta dentro del rango de la lista.
        if(posicion >= 0 && posicion <= size){
            // Si la posicion es al inicio de la lista
            if (posicion == 0) {
                insertarPrimero(dato);
            } else {
                // Si la posicion del nodo es al final
                if (posicion == size) {
                    insertarAlFinal(dato);
                } else {
                    // El nodo se debe insertar en algún lugar en medio de la lista
                    // Creamos el nuevo nodo
                    Nodo nuevo = new Nodo(dato);
                    Nodo aux = cabeza;
                    
                    // Recorrer la lista hasta llegar a la posicion 
                    // en la cual se insertara el nuevo nodo.
                    for (int i = 0; i < ( posicion - 1); i++) {
                        aux = aux.getSiguiente();
                    }
                    
                    // Une el nuevo nodo con el siguiente nodo de la lista.
                    nuevo.setSiguiente(aux.getSiguiente());
                    
                    // Inserta el nuevo nodo en la posición indicada.
                    aux.setSiguiente(nuevo);
                    
                    // Incrementa el contador de tamaño de la lista.
                    size++;
                }
            }
        }
    }
    
    /**
     * Obtiene el valor de un nodo para la posición determinada
     * @param posicion para obtener el nodo
     */
    public T getValor(int posicion) {
        
        // Verifica si la posición ingresada se encuentre en el rango
        if (posicion >= 0 && posicion <= size) {
            if (posicion == 0) {
                return (T) cabeza.getData();
            } else if (posicion == size) {
                return (T) cola.getData();
            } else {
                // El nodo se debe insertar en algún lugar en medio de la lista
                Nodo aux = cabeza;

                // Recorrer la lista hasta llegar a la posicion 
                // en la cual se insertara el nuevo nodo.
                for (int i = 0; i < ( posicion - 1); i++) {
                    aux = aux.getSiguiente();
                }
                
                return (T) aux.getData();
            }
        }
        
        return null;
    }
}

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
public class Pila<T> {
    // LIFO - Last in, first out
    // push, pop, peek
    private ListaSimple<T> stack;
    
    public Pila() {
        stack = new ListaSimple<>();
    }
    
    public int size() {
        return stack.getSize();
    }
    
    public void push(T data) {
        stack.push(data);
    }
    
    public T pop() {
        return (T) stack.pop().getData();
    }
    
    public T peek() {
        return (T) stack.getHead().getData();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public void printStack() {
        stack.printList();
    }
    
    public T getValueAt(int position) {
        T dato = null;
        
         // Verifica si la posición ingresada se encuentre en el rango
        if (position >= 0 && position <= size()) {
            if (position == 0) {
                return (T) stack.getHead().getData();
            } else {
                // El nodo se debe insertar en algún lugar en medio de la lista
                Node aux = stack.getHead();

                // Recorrer la lista hasta llegar a la posicion 
                // en la cual se insertara el nuevo nodo.
                for (int i = 0; i < ( position - 1); i++) {
                    aux = aux.getNext();
                }
                
                return (T) aux.getData();
            }
        }
        
        return dato;
    }
    
    public T search() {
        // TODO: pending implementation
        return null;
    }
    
    public void clear() {
        stack.clear();
    }
}

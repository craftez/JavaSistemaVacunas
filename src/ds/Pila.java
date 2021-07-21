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
        stack.addToFront(data);
    }
    
    public T pop() {
        return (T) stack.removeFromFront().getData();
    }
    
    public T peek() {
        return (T) stack.getCabeza().getData();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public void printStack() {
        stack.printList();
    }
    
    public T search() {
        // TODO: pending implementation
        return null;
    }
    
    public void clear() {
        stack.clear();
    }
}

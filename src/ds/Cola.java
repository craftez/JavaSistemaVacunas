package ds;

/**
 *
 * @author ez
 */
public class Cola<T> {
    // FIFO - First in, first out
    private Node first;
    private Node last;
    private int size;

    public Cola() {
        size = 0;
    }
    
    public void enqueue(T dato) {
        Node<T> nuevo = new Node(dato);
        if (first == null) {
            first = nuevo;
            last = nuevo;
        } else {
            last.setNext(nuevo);
            last = nuevo;
        }
        size++;
    }
    
    public T dequeue() {
        if (first == null) return null;
        T dato = (T) first.getData();
        first = first.getNext();
        size--;
        return dato;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public T getFirst() {
        if (isEmpty()) return null;
        return (T) this.first.getData();
    }
}

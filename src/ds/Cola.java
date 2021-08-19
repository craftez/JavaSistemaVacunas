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
    
    public T getValueAt(int position) {
        T dato = null;
        
         // Verifica si la posición ingresada se encuentre en el rango
        if (position >= 0 && position <= size) {
            if (position == 0) {
                return (T) first.getData();
            } else if (position == size) {
                return (T) last.getData();
            } else {
                // El nodo se debe insertar en algún lugar en medio de la lista
                Node aux = first;

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

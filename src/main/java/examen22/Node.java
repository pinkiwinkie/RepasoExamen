package examen22;

public class Node<T>{
    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
        next = null;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Node))
            return false;
        Node<T> obj = (Node)o;
        return obj.getElement().equals(element);
    }

    @Override
    public String toString() {
        return element + ((next != null) ? ", "+ next : "}");
    }
}
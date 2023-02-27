package examen21;

import java.util.Objects;

public class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Node))
            return false;
        Node<T> node = (Node) o;
        return node.getElement().equals(this.element);
    }

}

package examen21;

import java.util.Comparator;
import java.util.List;

public class MyList<T> implements MyStore<T> {

    private int size;
    private Node<T> head;

    public MyList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void add(T e) {
        Node<T> node = new Node<>(e);
        if (size == 0)
            head = node;
        else
            node.setNext(head);
        size++;
    }

    @Override
    public T get(int index) {
        T result = null;
        if (size == 0 || index < 0 || index >= size)
            return result;
        Node<T> node = head;
        while (index > 0) {
            node = node.getNext();
            index--;
        }
        result = node.getElement();
        return result;
    }

    @Override
    public T remove(int index) {
        T result = null;
        if (size == 0 || index < 0 || index >= size)
            return result;
        if (index == 0) {
            result = head.getElement();
            head = head.getNext();
        } else {
            Node<T> aux1 = head;
            Node<T> aux2 = head.getNext();
            while (index>1){
                aux1 = aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElement();
            aux1.setNext(aux2.getNext());
        }
        size--;
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public boolean contains(T e) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (e.equals(node.getElement()))
                return true;
            node = node.getNext();
        }
        return false;
    }

    @Override
    public List<T> sort() {
        return null;
    }

    @Override
    public List<T> sort(Comparator<T> c) {
        return null;
    }
}

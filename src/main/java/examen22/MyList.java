package examen22;

import java.lang.reflect.Array;

public class MyList<T> {
    private int size;
    private Node<T> head, tail;

    public MyList() {
        this.size = 0;
        head = null;
        tail = null;
    }

    public T get(int index) {
        T result = null;
        if (size == 0 || index < 0 || index >= size)
            return result;
        Node<T> node = head;
        while (index > 0) {
            node = node.getNext();
            index--;
        }
//        for (int i = 0; i <= index; i++) {
//            node = node.getNext();
//        }
        result = node.getElement();
        return result;
    }

//    public T[] toArray(Class c) {
//        T[] vector = (T[]) Array.newInstance(c, size);
//        Node node = head;
//        for (int i = 0; i < size; i++) {
//            vector[i] = (T) node.getElement();
//            node = node.getNext();
//        }
//        return vector;
//    }

    public void addHead(T element) {
        Node<T> node = new Node<>(element);
        if (size() == 0) {
            tail = node;
            head = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public void addTail(T element) {
        Node<T> node = new Node<>(element);
        if (size() == 0) {
            tail = node;
            head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public int search(T element) {
        int result = -1;
        if (size() == 0)
            return result;
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.getElement().equals(element))
                return i;
            node = node.getNext();
        }
        return result;
    }

    public T remove(int index) {
        T result = null;
        if (size() == 0 || index < 0 || index > size)
            return result;
        if (index == 0){
            result = head.getElement();
            head = head.getNext();
        } else{
            Node<T> aux1 = head;
            Node<T> aux2 = head.getNext();
            while (index>1){
                aux1=aux2;
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
    public String toString() {
        return "{ size: " + size + ", Element: " + ((head == null) ? "}" : head.toString());
    }

}

package MaletaEnlazada2309;

// Pila con la listas enlazadas y nodos implementada

import java.util.Iterator;

public class MaletaEnlazada<Item> implements Iterable <Item> {
    Node first;
    int count;

    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        count++;
    }
    
    public Item peak(){
        return first.item;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator<Item>{

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }


}

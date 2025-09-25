package colaEnlazada2309;

import pilaEnlazada1809.PilaEnlazada;

import java.util.Iterator;

public class ColaEnlazada <Item> implements Iterable <Item>{

    private Node first;
    private Node last;
    private int count;

    private class Node{
        Item item;
        Node next;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        oldLast.next = last;
        count++;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        count--;
        return item;
    }

    public Item peak(){
        return first.item;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
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

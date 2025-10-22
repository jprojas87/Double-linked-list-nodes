package listaDobleEnlazada2309;

import java.util.Iterator;

import java.util.LinkedList;

public class ListaDobleEnlazada<Item> implements Iterable<Item>{

    private Node first;
    private Node last;
    private int count;

    private class Node{
        Item item;
        Node next;
        Node prev;
    }

    //adiciona al final
    //agregar en cualquier sitio, pide un int index y revisa con un for y un contador la posicion
    public void add(Item item, int index){
        final Node predecesor
        if (index == size()){
            addLast(item);
        } else {

        }
    }


    public getPreviousNode(Node nodo){
        final Node predecesor = nodo.prev;
        final Node newNode = new Node();
        nodo.prev = newNode;
        if (predecesor == null)
            first = newNode;
        else
            predecesor.next = newNode;
    }


    public void addFirst(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        oldFirst.prev = first;
        count++;
    }

    public void addLast(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.prev = oldLast;
        oldLast.next = last;
        count++;
    }

    public void clear(){
        first = null;
        last = null;
        count = 0;
        //first.item = null;
        //last.item = null;
        //first.next = null;
        //last.prev = null;
    }

    //recorre los items del arreglo y tira un bool T o F si el item del metodo
    //existe en alguna posicion del arreglo
    public boolean contains(Item item){
        Node primero = first;
        while (primero != null){
            if (primero.item.equals(item)){
                return true;
            }
            primero = primero.next;
        }
        return false;
    }

    public Item get(){

    }

    public Item getFirst(){
        return first.item;
    }

    public Item getLast(){
        return last.item;
    }

    public boolean isEmpty(){
        return count == 0;
        //return first == null;
    }

    public boolean remove(){

    }

    public Item removeFirst(){
        Item item = first.item;
        first = first.next;
        count--;
        return item;
    }

    public Item removeLast(){
        Item item = last.item;
        last = last.prev;
        count--;
        return item;
    }

    public int size(){
        return count;
    }

    public boolean equals(){

    }

    public int indexOf(){

    }

    public void set(){

    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class DLLIterator implements Iterator<Item>{

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


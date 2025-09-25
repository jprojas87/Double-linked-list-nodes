package bagsqeuesstacks.colas_est_dat.pilas_est_datos;

// Una pila es una estructura tipo Last In First Out (LIFO) así que el último dato en entrar es el primero en salir
// y si quiero sacar el primer dato ingresado, tienen que salir antes todos los demás datos.

// Métodos:

/*
push(T elemento): Añade un elemento en la cima de la pila.
pop(): Elimina y devuelve el elemento de la cima (el último añadido).
peek() o top(): Devuelve el elemento en la cima sin eliminarlo.
isEmpty(): Indica si la pila está vacía.
size(): Devuelve el número de elementos en la pila.
*/

public class Stack<T>{
    private T[] elements;
    private int size;

    // Constructor de la clase pila
    public Stack() {
        elements = (T[]) new Object[1];
        size = 0;
    }

    // ver resize para el argumento del if
    public void push(T item) {
        if (size == elements.length) {
            resize(2 * elements.length);
        }
        elements[size] = item;
        size++;
    }

    // ver resize para el argumento del if
    public T pop() {
        T item = elements[--size];

        elements[size] = null;
        if (size > 0 && size == elements.length / 4) {
            resize(elements.length / 2);
        }
        return item;
    }


    /* resize toma el objeto temporal newArray cuando se cumple alguna condicion en .push o .pop (que llegue a la última
    posición del arreglo actual y necesite más espacio o que llegue al 25% o menos de la capacidad total del arreglo y
    necesite menos espacio) y le agrega los datos del arreglo anterior */

    private void resize(int newCapacity) {
        T[] newArray = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

    // true si esta vacia, false si tiene datos
    public boolean isEmpty() {
        return size == 0;
    }
    // cantidad de datos actuales
    public int size() {
        return size;
    }

    public T peek() {
        return elements[size - 1];
    }

    public void clear() {
        elements = (T[]) new Object[elements.length];
        size = 0;
    }
}


package bagsqeuesstacks.colas_est_dat.maletas_est_dat;

// Una maleta es una estructura que permite agregar elementos sin importar la posición, lo que busca retornar es la
// cantidad de veces que se repite el mismo elemento dentro de la estructura.

// igual al stack pero sin el metodo del pop

// Métodos:

/*
add(T elemento): Añade un elemento.
remove(T elemento): Elimina una ocurrencia del elemento (si lo hay).
contains(T elemento): Indica si el elemento está en la maleta.
size(): Cantidad total de elementos.
isEmpty(): Indica si la maleta está vacía.
iterator(): Para recorrer todos los elementos (por ser iterable).
*/

public class Bag<T>{
    private T[] elements;
    private int size;

    // Constructor de la clase pila
    public Bag() {
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

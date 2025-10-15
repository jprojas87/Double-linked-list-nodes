package AgendaContactos1410;

/*
PROYECTO CORTICO DE JAVA SEGÚN MI PARCERO:

Hacer la aplicación en una agenda de contactos usando una lista doblemente enlazada la cual deje
ver la funcionalidad de todos los métodos de la lista que creamos.

Crear una clase Contacto, guiarse por los datos que uno ve en su teléfono cuando llena un
nuevo, esta tiene que implementar la interfaz comparable y probablemente use el método compareTo.
Tiene que poder insertar, buscar, actualizar, combinar (si hay contactos duplicados, que sugiera
unirlos en uno solo) y eliminar contactos.

Para mejorar la eficiencia, en los métodos que tienen índices, verificar en donde está el dato
que quiero encontrar y que decida si recorrer la estructura desde el inicio o el final
dependiendo de que tan cerca este el dato del inicio o el final.

Que se puedan organizar los contactos por grupos familiares, corporativos, de amigos. Que también
deje guardar ciertos contactos como favoritos.
Que tenga un apartado de estadísticas que guarde las estadísticas de los contactos que más
interacciones tengan.

En cuanto a ordenamiento, implementar el método toArray y al arreglo temporal aplicarle el
algoritmo de ordenamiento Merge Sort.
 */


public class AgendaContactos {

}

public class Merge
{
    private static Comparable[] aux; // auxiliary array for merges
    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length]; // Allocate space just once.
        sort(a, 0, a.length - 1);
    }
    private static void sort(Comparable[] a, int lo, int hi)
    { // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid); // Sort left half.
        sort(a, mid+1, hi); // Sort right half.
        merge(a, lo, mid, hi); // Merge results (code on page 271).
    }

    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

    public static void merge(Comparable[] a, int lo, int mid, int hi)
    { // Merge a[lo..mid] with a[mid+1..hi].
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
            if (i > mid) a[k] = aux[j++];
            else if (j > hi ) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
    }


}

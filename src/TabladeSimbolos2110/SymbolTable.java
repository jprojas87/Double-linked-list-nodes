package TabladeSimbolos2110;


/*
Una tabla de símbolos es una estructura de datos tipo clave-valor que soporta dos operaciones:
insert (poner) un nuevo par en la tabla y search (obtener) el valor asociado con la clave dicha.

Tablas clave valor, cuando uno hace la búsqueda en un diccionario uno busca la clave y recibe
el valor
 */



public class SymbolTable <Key, Value> {
    // constructor de la symbol table
    private ST(){

    }
    // Añade un valor y una clave, si ya existe la clave actualiza el valor, si le paso nulo a
    // una clave, hace un borrado lógico de esa clave como tal
    void put(Key key, Value value){

    }
    // Retorna el valor de la clave que le pasemos como parámetro
    public get(Key key){

    }
    // Remueve la clave y el valor dado como parámetro de la est. de datos
    void delete(Key key){

    }
    // Retorna el valor que guarda la clave que le pasamos como parámetro
    boolean contains(Key key){
    // retorna si la lista esta vacía
    }
    boolean isEmpty(){
        return size() = 0;
    }
    // Retorna la cantidad de datos guardados en la est. de datos
    public int size(){
        return count;
    }
    // Interfaz iterable, el método devuelve todas las claves
    Iterable<Key> keys(){

    }

}

package aerolinea2808;

    //cada bodega (sala de espera) esta representada pr una lista
    // el counter esta representada por una cola
    // L son los primeros en embarcar y en salir (jerarquia)
    // cada avion se representa con una pila (los de l son los primeros en entrar)
    //en las maletas se guardan estadisticas de los vuelos
    //si una persona s se pasa del peso por maleta toca que compre un tiquete de mayor categoria ()
    // cantidad minima para que despegue el avion es de 50 pasajeros
    // peso maximo de la maleta por pasaje l=30 m=20 s=10
    /*
    1 cola de entrada (counter)
    5 listas (bodegas pre embarque)
    5 pilas (5 aviones)
    5 colas (colas de espera por si hay desbordamiento)
    5 maletas para estadisticas (peso y cantidad de maletas en cada vuelo)
    (crear 100 personas de atributos aleatorios para la prueba)
     */


    /*
    Lógica menú
    Metodos:
    registrar equipaje (crea la maleta con sus respectivos atributos y la pasa a la cola general)
    procesar equipaje (Habiendo varias, pasa las maletas a las bodegas)
    clasificar equipajes (ordene las bodegas antes de pasarlas a los aviones, por categoria de ticket)
    cancelar viajero (SI AUN EN LA BODEGA (si ya en el avion paila), eliminar una maleta)
    abordar vuelo (con suficientes pasajeros (50 min), pasa las maletas ordenadas a las pilas(aviones))
    desembarcar vuelo (elimina a todas las maletas de la pila y guarda las stats(peso y cant total por avion))
    mostrar estadisticas acumuladas (muestra las stats)
    mostrar lista de pasajeros (cualquier momento) [ya no, opcional]
    salir
    */

    /*
    confesion al principio de la sustentacion
     */
public class Aerolinea {
}

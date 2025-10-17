package AgendaContactos;
import listaDobleEnlazada2309.ListaDobleEnlazada;

public record Contacto(
        String nombre,
        Integer telefono,
        String email,
        String categoria,
        Integer cantidadLlamadas,
        boolean favorito
) implements Comparable<Contacto> {



    @Override
    public int compareTo(Contacto o) {
        int cmp = this.telefono.compareTo(o.telefono);
        if (cmp != 0) {
            return cmp;
        }
        return this.email.compareTo(o.email);
    }

}


package ArbolTarjeta;

/**
 *
 * @author Master79
 */
public class Nodo {
    
    private Nodo izquierda;
    private Nodo derecha;
    private Tarjeta dato;

    public Nodo(Tarjeta dato) {
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Tarjeta getDato() {
        return dato;
    }

    public void setDato(Tarjeta dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}

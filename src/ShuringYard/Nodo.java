package ShuringYard;

public class Nodo {

    private Integer elemento;
    private Nodo anterior;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Integer elemento, Nodo anterior, Nodo siguiente) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Nodo(Integer elemento) {
        this.elemento = elemento;
    }

    public Integer getElemento() {
        return elemento;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Elemento=" + elemento;
    }

}

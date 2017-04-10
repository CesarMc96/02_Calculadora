package Objetos;

public class Nodo<T> {

    private T Elemento;
    private Nodo<T> liga;

    Nodo(T Elemento) {
        this.Elemento = Elemento;
        this.liga = null;
    }

    Nodo() {

    }

    public T getElemento() {
        return Elemento;
    }

    public void setElemento(T Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo<T> getLiga() {
        return liga;
    }

    public void setLiga(Nodo<T> liga) {
        this.liga = liga;
    }

}

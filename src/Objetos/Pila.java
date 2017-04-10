package Objetos;

public class Pila<T> {

    private Lista<T> lista = new Lista<>();

    public void push(T dato) {
        lista.insertaInicio(dato);
    }

    public T pop() throws Exception {
        try {
            return lista.obtenPrimerElemento();
        } catch (Exception ex) {
            throw new Exception("La pila está vacía");
        }
    }

    public T peek() throws Exception {
        try {
            return lista.obtenPrimerElementoSinEliminar();
        } catch (Exception ex) {
            throw new Exception("La pila está vacía");
        }
    }

    public boolean vacia() {
        return lista.getInicio() == null;
    }

}

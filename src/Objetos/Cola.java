package Objetos;

public class Cola<T> {

    private Lista<T> lista = new Lista<>();

    public void push(T dato) {
        lista.insertaInicio(dato);
    }

    public T pop() throws Exception {
        try {
            return lista.obtenUltimoElemento();
        } catch (Exception ex) {
            throw new Exception("La pila está vacía");
        }
    }

    public T peek() throws Exception {
        try {
            return lista.obtenUltimoElementoSinEliminar();
        } catch (Exception ex) {
            throw new Exception("La pila está vacía");
        }
    }

    public boolean vacia() {
        return lista.getInicio() == null;
    }

    @Override
    public String toString() {
        String resultado = "";
        Nodo<T> aux = lista.invertir().getInicio();
        while (aux != null) {
            resultado = resultado + aux.getElemento().toString();
            aux = aux.getLiga();
        }
        return resultado;
    }
}

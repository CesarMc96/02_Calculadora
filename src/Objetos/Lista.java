package Objetos;

import Exceptions.LinkedListException;

public class Lista<T> {

    private Nodo<T> inicio;

    @Override
    public String toString() {
        String resultado = "{";
        if (getInicio() == null) {
            return "Lista vacía";
        } else {
            Nodo<T> aux = inicio;
            while (aux != null) {
                resultado = resultado + aux.getElemento().toString() + ",";
                aux = aux.getLiga();
            }
        }
        return resultado.substring(0, resultado.length() - 1) + "}";

    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public void insertaInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setLiga(inicio);
        inicio = nuevo;

    }

    public void insertaFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        Nodo<T> aux = inicio;
        if (inicio == null) {
            inicio = nuevo;
        } else {
            while (aux.getLiga() != null) {
                aux = aux.getLiga();
            }
            aux.setLiga(nuevo);
        }
    }

    public void insertaAntesDato(T dato, T datoInicial) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("La lista está vacía.");
        }
        Nodo<T> actual = inicio;
        Nodo<T> anterior = null;
        boolean band = false;
        while (!actual.getElemento().equals(datoInicial) && !band) {
            if (actual.getLiga() != null) {
                anterior = actual;
                actual = actual.getLiga();
            } else {
                band = true;
            }

        }
        if (!band) {
            Nodo<T> nodo = new Nodo<>(dato);
            if (actual == inicio) { 
                nodo.setLiga(inicio);
                inicio = nodo;
            } else {
                anterior.setLiga(nodo);
                nodo.setLiga(actual);
            }

        } else {
            throw new LinkedListException("El nodo dado como referencia no está en la lista");
        }
    }

    public void insertaDespuesDato(T dato, T datoInicial) throws LinkedListException {
        if (inicio == null) {
            throw new LinkedListException("La lista está vacía.");
        }
        Nodo<T> actual = inicio;
        boolean band = false;
        while (!actual.getElemento().equals(datoInicial) && !band) {
            if (actual.getLiga() != null) {
                actual = actual.getLiga();
            } else {
                band = true;
            }

        }
        if (!band) {
            Nodo<T> nodo = new Nodo<>(dato);
            nodo.setLiga(actual.getLiga());
            actual.setLiga(nodo);
        } else {
            throw new LinkedListException("El nodo dado como referencia no está en la lista");
        }
    }


    public void borrarPrimerElemento() {
        if (inicio != null) {
            inicio = inicio.getLiga();
        }
    }


    public T obtenPrimerElemento() throws Exception {
        T dato = null;
        if (inicio != null) {
            dato = inicio.getElemento();
            inicio = inicio.getLiga();
        } else {
            throw new Exception("La lista está vacía");
        }
        return dato;
    }

    public T obtenPrimerElementoSinEliminar() throws Exception {
        T dato = null;
        if (inicio != null) {
            dato = inicio.getElemento();

        } else {
            throw new Exception("La lista está vacía");
        }
        return dato;
    }

    public void borrarUltimoElemento() {
        Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        if (inicio.getLiga() == null) {
            inicio = null;
        } else {
            while (aux.getLiga() != null) {
                anterior = aux;
                aux = aux.getLiga();
            }
            anterior.setLiga(null);
        }
    }

    public T obtenUltimoElemento() {
        Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        T resultado = null;
        if (inicio.getLiga() == null) {
            resultado = inicio.getElemento();
            inicio = null;
        } else {
            while (aux.getLiga() != null) {
                anterior = aux;
                aux = aux.getLiga();
            }
            resultado = aux.getElemento();
            anterior.setLiga(null);
        }
        return resultado;
    }

    public T obtenUltimoElementoSinEliminar() {
        Nodo<T> aux = inicio;
        Nodo<T> anterior = null;
        T resultado = null;
        if (inicio.getLiga() == null) {
            resultado = inicio.getElemento();
            //inicio = null;
        } else {
            while (aux.getLiga() != null) {
                anterior = aux;
                aux = aux.getLiga();
            }
            resultado = aux.getElemento();
            //anterior.setLiga(null);
        }
        return resultado;
    }

    public void clear() {
        inicio = null;
    }

    public Lista<T> invertir() {
        Lista<T> resultado = new Lista<>();
        Nodo<T> aux = inicio;
        while (aux != null) {
            resultado.insertaInicio(aux.getElemento());
            aux = aux.getLiga();
        }
        return resultado;
    }

}

package ShuringYard;

import Excepciones.ElementoNoEncontradoException;
import Excepciones.ListaVaciaException;
import java.util.Objects;

public class Lista {

    private Nodo inicio;
    private Integer contador;

    public Lista() {
        inicio = null;
        contador = 0;
    }

    public void insertarFinal(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

        sumarContador();
    }

    public boolean ListaVacia() {
        return inicio == null;
    }

    public void insertarPrincipio(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        sumarContador();
    }

    public void recorrerLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getElemento());
            aux = aux.getSiguiente();
        }
    }

    public void insertarOrdenado(Integer elemento) {
        Nodo nuevo = new Nodo(elemento);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            Nodo anterior = null;

            while (aux != null && aux.getElemento() < elemento) {
                anterior = aux;
                aux = aux.getSiguiente();
            }

            if (anterior == null) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            } else {
                anterior.setSiguiente(nuevo);
                nuevo.setSiguiente(aux);
            }
        }
        sumarContador();
    }

    public boolean existeElemento(Integer elemento) {
        Nodo aux = inicio;

        while (aux != null && !Objects.equals(aux.getElemento(), elemento)) {
            aux = aux.getSiguiente();
        }

        return aux != null;
    }

    public boolean estaOrdenada() {
        Nodo aux = inicio;
        boolean bandera = true;

        while (aux != null && bandera) {
            bandera = aux.getElemento() != null && aux.getElemento() <= aux.getSiguiente().getElemento();
            aux = aux.getSiguiente();
        }

        return aux != null;
    }

    public void sumarContador() {
        contador++;
    }

    public Integer totalElementos() {
        return contador;
    }

    public void eliminarInicio() {
        if (!ListaVacia()) {
            Nodo aux = inicio;
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);
        }
    }

    public void eliminarFinal() {
        Nodo aux = inicio;
        Nodo ant = null;

        while (aux != null && aux.getSiguiente() == null) {
            ant = aux;
            aux = aux.getSiguiente();
        }

        if (aux != null) {
            if (ant == null) {
                inicio = null;
            } else {
                ant.setSiguiente(null);
            }
        }
    }

    public void elementarElemento(Integer elemento) throws ElementoNoEncontradoException {
        Nodo aux = inicio;
        Nodo ant = null;

        while (aux != null && !Objects.equals(aux.getElemento(), elemento)) {
            ant = aux;
            aux = aux.getSiguiente();
        }

        if (aux != null) {
            throw new ElementoNoEncontradoException();
        } else if (ant == null) {
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);
        } else {
            ant.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(null);
        }
    }

    public void eliminarElementoRepetido(Integer elemento) throws ElementoNoEncontradoException {
        Nodo aux = inicio;
        Nodo ant = null;
        Boolean bandera = false;

        while (aux != null) {
            if (Objects.equals(aux.getElemento(), elemento)) {
                bandera = true;
                if (ant == null) {
                    inicio = inicio.getSiguiente();
                    aux.setSiguiente(null);
                    aux = inicio;
                } else {
                    ant.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    aux = ant.getSiguiente();
                }
            } else {
                ant = aux;
                aux = aux.getSiguiente();
            }
        }

        if (bandera) {
            throw new ElementoNoEncontradoException();
        }
    }

    public void agregar(Lista lista) {
        if (ListaVacia()) {
            inicio = lista.inicio;
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(lista.inicio);
        }
    }

    public Integer sacarElemento() throws ListaVaciaException {
        if (ListaVacia()) {
            throw new ListaVaciaException();
        } else {
            Integer resultado = inicio.getElemento();
            Nodo aux = inicio;
            inicio = inicio.getSiguiente();
            aux.setSiguiente(null);
            return resultado;
        }
    }

    public Integer getMayor() {
        int mayor = 0;
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getElemento() > mayor) {
                mayor = aux.getElemento();
            }
            aux = aux.getSiguiente();
        }
        return mayor;
    }

    public Lista invertir() {
        Nodo aux = inicio;
        Lista otra = new Lista();
        while (aux != null) {
            otra.insertarPrincipio(aux.getElemento());
            aux = aux.getSiguiente();
        }
        return otra;
    }

    public Lista sumar(Lista nueva) {
        Lista suma = new Lista();
        Nodo n;
        Nodo aux = inicio;
        Nodo aux2 = nueva.inicio;
        int a;
        int b;
        int c;
        while (aux != null) {
            a = aux.getElemento();
            if (aux2 != null) {
                b = aux2.getElemento();
            } else {
                b = 0;
            }
            c = a + b;
            if (c >= 10) {
                c = c - 10;
                if (aux.getSiguiente() != null) {
                    aux.getSiguiente().setElemento(aux.getSiguiente().getElemento()+ 1);
                } else {
                    n = new Nodo(1);
                    aux.setSiguiente(n);
                }
            }
            n = new Nodo(c);
            suma.insertarFinal(n.getElemento());
            aux = aux.getSiguiente();
            if (aux2 != null) {
                aux2 = aux2.getSiguiente();
            }
        }
        return suma;
    }
    
    public Lista restar(Lista nueva) {
        Lista resta = new Lista();
        Nodo n;
        Nodo aux = inicio;        
        Nodo aux2 = nueva.inicio;
        int a;                
        int b;
        int c;
        while (aux != null) {
            a = aux.getElemento();
            if(aux2 != null)
                b = aux2.getElemento();                
            else 
                b = 0;
            c = a - b;
            if (c < 0) {
                c = c + 10;
                Nodo aux4 = aux.getSiguiente();
                while(aux4.getElemento()==0) {
                    aux4.setElemento(9);
                    aux4 = aux4.getSiguiente();
                }
            }       
            n = new Nodo(c);
            resta.insertarFinal(n.getElemento());
            aux = aux.getSiguiente();
            if(aux2 != null) {
                aux2 = aux2.getSiguiente();
            }
        }
        if(resta.inicio.getElemento()==0) {
            resta.eliminarFinal();
        }
        return resta;
    }
}


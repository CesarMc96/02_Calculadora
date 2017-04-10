package ShuringYard;

public class Cola {

    private Lista lista;
    private Integer maximo;

    public Cola() {
        this.lista = new Lista();
        maximo = 0;
    }

    public Cola(Integer maximo) {
        this.maximo = maximo;
        lista = new Lista();
    }

    public boolean Vacio() {
        return lista.getInicio() == null;
    }

    public void Inicio() {
        lista.Inicio();
    }

    public Integer front() {
        return lista.getInicio().getElemento();
    }

    public Nodo Adelante(Boolean bandera) {
        return lista.getInicio();
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }
    
    

}

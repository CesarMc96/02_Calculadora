
package ShuringYard;

public class Pila {
    
    private Lista lista;
    private Integer Maximo;
    
    public boolean Vacio() {
        return lista.getInicio()==null;
    }
    
    public void Inicio(){  
            lista.Inicio();
    }        
    
    public Integer Dato() {
        return lista.getInicio().getElemento();
    }
    
    public Nodo Dato(Boolean bandera) {
        return lista.getInicio();
    }
    
    
    @Override
    public String toString() {
        return lista.toString();
    }

    public Pila(int tope) throws TopeInvalidoException {
        if (tope < 1) throw new TopeInvalidoException();
        this.tope = tope;
        lista = new Lista<T>();
    }

    public Pila() {
        this.tope = 0;
        lista = new Lista<T>();        
    }
    
}

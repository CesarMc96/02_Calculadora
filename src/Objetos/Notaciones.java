
package Objetos;

public class Notaciones {

    public Cola<String> convertirPostfija(String infija) throws Exception {
        Cola<String> colaPostfija = new Cola<>();
        Pila<String> pila = new Pila<>();
       
        for (char cLetra :  infija.toCharArray()) {
            String letra = String.valueOf(cLetra);
            if (letra.equals("(")) {
                pila.push(letra);
            } else {
                if (letra.equals(")")) {
                    while (!pila.peek().equals("(")) {
                        colaPostfija.push(pila.pop());
                    }
                    pila.pop();
                } else {
                    if (Simbolos.isOperando(letra)) {
                        colaPostfija.push(letra);
                    } else {
                        while (!pila.vacia() && Simbolos.lessOrEqualThan(letra, pila.peek()) && !pila.peek().equals("(")) {
                            colaPostfija.push(pila.pop());
                        }
                        pila.push(letra);
                    }
                }
            }
        }
        while (!pila.vacia()) {
            colaPostfija.push(pila.pop());
        }
           
        return colaPostfija;
    }

}

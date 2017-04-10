package Principal;

import Objetos.Notaciones;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        Notaciones notaciones = new Notaciones();
        try {
            System.out.println(notaciones.convertirPostfija("(4+5)^3/4+(3-2)"));
        } catch (Exception ex) {
            Logger.getLogger(Notaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

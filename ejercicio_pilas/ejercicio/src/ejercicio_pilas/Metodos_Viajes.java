package ejercicio_pilas;

import javax.swing.JOptionPane;

public class Metodos_Viajes {

    private Pila<clsViaje> pilaViaje;
    private Pila<clsViaje> pilaAuxViaje;
    private String cadena;
    private int cantViajes;

    public Metodos_Viajes() {
        pilaViaje = new Pila();
        pilaAuxViaje = new Pila();
        cadena = "";
        cantViajes = 0;
    }

    public String Agregarviaje() {
        Object [] options ={"1","2","3"};
        int n = JOptionPane.showOptionDialog(frame,
                    "Would you like some green eggs to go "
                    + "with that ham?",
                    "A Silly Question",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);

        while (JOptionPane.showConfirmDialog(null,
                "¿Desea agregar un viaje?")
                == JOptionPane.YES_NO_OPTION) {
            pilaViaje.apilar(new clsViaje(Integer.toString(cantViajes + 1),
                    n,
                    cadena, 
                    cantViajes,
                    cadena, 
                    cadena
            ));

            cantViajes++;
        }
        return cadena;
    }
}

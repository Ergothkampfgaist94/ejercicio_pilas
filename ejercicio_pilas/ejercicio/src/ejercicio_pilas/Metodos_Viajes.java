package ejercicio_pilas;

import javax.swing.JOptionPane;

public class Metodos_Viajes {

    private Pila<clsViaje> pilaViaje;
    private Pila<clsViaje> pilaAuxViaje;
    private String cadena;
    private int cantViajes;

    public Pila<clsViaje> getPilaViaje() {
        return pilaViaje;
    }

    public Metodos_Viajes() {
        pilaViaje = new Pila();
        pilaAuxViaje = new Pila();
        cadena = "";
        cantViajes = 0;
    }

    public String Agregarviaje() {        

        while (JOptionPane.showConfirmDialog(null,
                "¿Desea agregar un viaje?")
                == JOptionPane.YES_NO_OPTION) {
            Object [] options ={"1","2","3"};
        int n = JOptionPane.showOptionDialog(null,
                    "Escoja el destino al que quiere viajar",
                    "ESCOGER DESTINO",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            pilaViaje.apilar(new clsViaje(Integer.toString(cantViajes + 1),
                    String.valueOf(options[n]),
                    "Bogotá", 
                    1000000,
                    Integer.toString(cantViajes+10), 
                    Integer.toString(100)
            ));
            cantViajes++;
        }
        
        return "Se agregaron" + Integer.toString(cantViajes) + " viajes. " ;
    }
}

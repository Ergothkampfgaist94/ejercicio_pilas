package ejercicio_pilas;

import java.util.Stack;
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

        while (JOptionPane.showConfirmDialog(null,
                "¿Desea agregar un viaje?")
                == JOptionPane.YES_NO_OPTION) {
            String destino = preguntarDestino();
            pilaViaje.apilar(new clsViaje(Integer.toString(cantViajes + 1),
                    destino,
                    "Bogotá",
                    1000000,
                    Integer.toString(cantViajes + 10),
                    Integer.toString(100)
            ));
            cantViajes++;
        }

        return "Se agregaron" + Integer.toString(cantViajes) + " viajes. ";
    }

    public String MostrarPila() {
        cadena = "Lista de viajes\n\n";
        while (!pilaViaje.estaVacia()) {
            clsViaje impresorViajes;
            impresorViajes = pilaViaje.getElemento();
            cadena += "\nnúmero de ticket: " + impresorViajes.getIdViaje()
                    + "\nLugar de destino: " + impresorViajes.getDestino()
                    + "\nHotel: " + impresorViajes.getIdHotel()
                    + "\nvuelo número: " + impresorViajes.getIdVuelo()
                    + "\nLugar de origen del vuelo: " + impresorViajes.getOrigen()
                    + "\n";
            pilaAuxViaje.apilar(pilaViaje.getElemento());
            pilaViaje.desapilar();
        }
        reacomodarPila(pilaAuxViaje);
        return cadena + "\nMuchas gracias\n";
    }

    public String ModificarPilaViaje(String Id_Viaje, int datoModificar) {

        boolean paso = false;
        String mensajeExito;
        cadena = "";

        while (!pilaViaje.estaVacia()) {
            clsViaje capturaViajes;
            capturaViajes = pilaViaje.getElemento();
            if (capturaViajes.getIdViaje().equalsIgnoreCase(Id_Viaje)) {
                paso = true;
                switch (datoModificar) {
                    case 1:
                        capturaViajes.setIdHotel(JOptionPane.showInputDialog(""));

                        break;
                    default:
                        throw new AssertionError();
                }
            }
            {

            }else {
            }

        }

        return cadena;
    }

    private void reacomodarPila(Pila<clsViaje> pilaAuxViaje) {

        while (!pilaAuxViaje.estaVacia()) {
            pilaViaje.apilar(pilaAuxViaje.getElemento());
            pilaAuxViaje.desapilar();
        }
    }

    private String preguntarDestino() {
        Object[] options = {"Ibiza", "Punta cana", "Disney"};
        int n = JOptionPane.showOptionDialog(null,
                "Escoja el destino al que quiere viajar",
                "ESCOGER DESTINO",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
        return String.valueOf(options[n]);
    }
}

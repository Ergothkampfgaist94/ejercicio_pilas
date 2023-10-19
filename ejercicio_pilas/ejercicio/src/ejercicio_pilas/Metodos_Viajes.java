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
            String hotel = preguntarHotel();
            pilaViaje.apilar(new clsViaje(Integer.toString(cantViajes + 1),
                    destino,
                    "Bogotá",
                    1000000,
                    Integer.toString(cantViajes + 10),
                    hotel));
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
        String mensajeExito = "";
        cadena = "";

        while (!pilaViaje.estaVacia()) {
            clsViaje capturaViajes;
            capturaViajes = pilaViaje.getElemento();
            if (capturaViajes.getIdViaje().equalsIgnoreCase(Id_Viaje)) {
                paso = true;
                switch (datoModificar) {
                    case 1:
                        capturaViajes.setIdHotel(preguntarHotel());
                        break;
                    case 2:
                        capturaViajes.setDestino(preguntarDestino());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "SALIENDO");
                        break;
                    default:
                        return cadena = "Intente de nuevo";
                }
                pilaAuxViaje.apilar(pilaViaje.getElemento());
                pilaViaje.desapilar();
            } else {
                pilaAuxViaje.apilar(pilaViaje.getElemento());
                pilaViaje.desapilar();
            }

        }
        if (paso) {
            mensajeExito = "viaje enconcontrado.\n\n";
        } else {
            cadena = "identificaciòn de viaje errado.";
        }
        reacomodarPila(pilaAuxViaje);

        return mensajeExito + cadena;
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

    private String preguntarHotel() {
        boolean hotel = JOptionPane.showConfirmDialog(null,
                "¿Desea agregar un Hotel?")
                == JOptionPane.YES_NO_OPTION;
        if (hotel) {
            Object[] options = {"Una estrella",
                "dos estrellas",
                "tres estrellas"};
            int n = JOptionPane.showOptionDialog(null,
                    "Escoja la catgoría del hotel que desea",
                    "ESCOGER HOTEL",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[2]);
            return String.valueOf(options[n]);

        }
        return "No se seleccionó hotel";
    }

    public int escogerPregunta() {
        Object[] options = {"Modificar destino",
            "Modificar Hotel"};
        int n = JOptionPane.showOptionDialog(null,
                "Escoja el elemento que desea modificar del viaje",
                "ESCOGER ELEMENTO A MODIFICAR",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        return n;
    }
}

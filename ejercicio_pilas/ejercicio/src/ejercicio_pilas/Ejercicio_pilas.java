package ejercicio_pilas;

import javax.swing.JOptionPane;

public class Ejercicio_pilas {

    public static void main(String[] args) {

        Metodos_Viajes nuevoviaje = new Metodos_Viajes();
        int option = 0;

        while (option != 3) {
            JOptionPane.showMessageDialog(null, "Menú\n");
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione loq ue desea hacer\n"
                    + "1. agregar viaje\n"
                    + "2. mostrar viaje\n"
                    + "3. modificar viaje\n"
                    + "4. salir\n"));
            switch (option) {
                case 1:
                    JOptionPane.showMessageDialog(null, nuevoviaje.Agregarviaje());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, nuevoviaje.MostrarPila());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, nuevoviaje.ModificarPilaViaje(JOptionPane.showInputDialog("Digite el identificador del viaje"),
                            nuevoviaje.escogerPregunta()));
                    break;
                case 4:

                    break;
                default:
                    throw new AssertionError();
            }
        }
//        String llenar_Pila = nuevoviaje.Agregarviaje();
//        JOptionPane.showMessageDialog(null, llenar_Pila);
//        String mostrar_viajes = nuevoviaje.MostrarPila();
//        JOptionPane.showMessageDialog(null, mostrar_viajes);
    }

}

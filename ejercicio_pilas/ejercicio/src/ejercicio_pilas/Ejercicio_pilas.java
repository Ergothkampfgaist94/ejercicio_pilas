package ejercicio_pilas;

import javax.swing.JOptionPane;

public class Ejercicio_pilas {

    public static void main(String[] args) {
        Metodos_Viajes nuevoviaje = new Metodos_Viajes();
        String viajei = nuevoviaje.Agregarviaje();
        JOptionPane.showMessageDialog(null,viajei);
        JOptionPane.showMessageDialog(null,nuevoviaje.getPilaViaje().getElemento());
    }

}

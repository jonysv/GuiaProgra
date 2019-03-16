package guiaprogra;

import javax.swing.JOptionPane;

public class Procesamiento {

    public void procesamiento(float base, int exponente) {
        float resultado = 0, potencia = 1;
        for (int contador = 0; contador < 10; contador++) {
            Math.round(Math.pow(base, exponente));
            resultado = resultado + (float) Math.pow(base, exponente);
            base = resultado;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma de potencias de 10 números es: " + Math.round(resultado));
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class Entrada {
    
    public int exponente(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduzca el exponente"));
        
    }
    public float base(){
        return Float.parseFloat(JOptionPane.showInputDialog("Introduzca el exponente"));
    
    }
    
}

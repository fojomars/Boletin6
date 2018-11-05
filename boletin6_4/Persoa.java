/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Persoa {
    
    public void mostrarPeso(){
        //Declaración de variables
        String nom1,nom2;
        nom1 =JOptionPane.showInputDialog("Introduzca el primer nombre: ");
        nom2 = JOptionPane.showInputDialog("Introduzca el segundo nombre: ");
        float peso1,peso2;
        peso1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer peso"));
        peso2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo peso"));
        
        if(peso1>peso2){
            JOptionPane.showMessageDialog(null,"El que pesa más es " + nom1 + "\nLa diferencia de peso es " + (peso1-peso2));
        }
        else{
            JOptionPane.showMessageDialog(null,"El que pesa más es " + nom2 + "\nLa diferencia de peso es " + (peso2-peso1));
        }
        
    }
    
}

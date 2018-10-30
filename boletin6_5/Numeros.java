/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Numeros {
    public void mostrarNumeros(){
        short num1,num2,num3;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el primer número"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el segundo número"));
        num3 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el tercero número"));
        
        
        if(num1>num2){
            JOptionPane.showMessageDialog(null, "El mayor es " + num1);
        }
        else if(num3>num1){
            JOptionPane.showMessageDialog(null, "El mayor es " + num3);
        }
        else if(num3>num2){
            JOptionPane.showMessageDialog(null, "El mayor es " + num3);
        }
        else{
           JOptionPane.showMessageDialog(null, "El mayor es " + num2);
        }
        
    }
}

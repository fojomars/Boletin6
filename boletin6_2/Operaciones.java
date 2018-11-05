/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;
import javax.swing.JOptionPane;
/**
 *
 * @author fojomars
 */
public class Operaciones {

    
    public void sumaResta(){
        short num1,num2;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Teclea el primer número:"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Teclea el segundo número:"));
        
        if(num1>=num2){
            System.out.println("La resta es: " + (num1-num2) );
        }
        else{
            System.out.println("La suma es: " + (num1+num2));
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Signo {
    public void positivoNegativo(){
        short num1 = Short.parseShort(JOptionPane.showInputDialog("Teclea un número:"));
        if(num1>0){
            System.out.println("+");
        }
        
        else if(num1<0){
            System.out.println("-");       
        }
        else{
             System.out.println("0");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Superficie {
    public void calcularSuperficie(){
        // Variables
        int op;
        double area, base, altura, radio;
        op = Integer.parseInt(JOptionPane.showInputDialog("Elige que superficie quieres calcular: \n 1-> Cuadrado\n 2-> Triángulo\n 3-> Círculo\n  "));
        //Switch Case
        switch (op){
            // Área del cuadrado
            case 1: base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base del cuadrado: ")); // Pedimos la base cuadrado
                    area = base*base; // Calculamos el area
                    JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + area); // Mostramos el area del cuadrado
                    break;
            
            // Área del triángulo        
            case 2: base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base del triángulo: ")); // Pedimos la base del triangulo
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura del triángulo: ")); // Pedimos la altura del triangulo 
                    area = base * altura/2; // Calculamos el area del triangulo
                    JOptionPane.showMessageDialog(null, "El área del triángulo es: " + area); // Mostramos el area del triangulo
                    break;
            
            // Área del círculo
            case 3: radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio del círculo: ")); // Pedimnos el radio del circulo
                    area = Math.PI * Math.pow(radio,2); // Calculamos el area del triangulo
                    JOptionPane.showMessageDialog(null, "El área del círculo es: " + area); //Mostramos el area del circulo
                    break;
            default: System.out.println("Opción no válida");  
        }
}
    
}

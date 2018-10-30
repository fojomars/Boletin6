/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author fojomars
 */
public class Almacen {
    public void vendasAnuales(){
        String nomProducto;
        nomProducto = JOptionPane.showInputDialog("Introduzaca el nombre del producto: ");
        int numProducto;
        numProducto = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de productos: "));
        
        if(numProducto<=100){
            JOptionPane.showMessageDialog(null, "El producto" + nomProducto + "es de bajo consumo");
        }
        else if(numProducto<=500){
            JOptionPane.showMessageDialog(null, "El producto " + nomProducto + " es de medio consumo");
        }
        else if(numProducto<1000){
            JOptionPane.showMessageDialog(null, "El producto " + nomProducto + " es de alto consumo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El producto " + nomProducto + " es de primera necesidad");
        }

    }
}

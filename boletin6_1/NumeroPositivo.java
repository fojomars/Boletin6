/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1;
import java.util.Scanner;
/**
 *
 * @author fojomars
 */
public class NumeroPositivo {
    public void numPositivo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Teclea un número: ");
        int num1 = ler.nextInt();
        
        //CONDICIONAL SIMPLE
        if(num1>0){
            System.out.println("El número es positivo");
        }
        System.out.println(" Termina el programa.");
    }
}

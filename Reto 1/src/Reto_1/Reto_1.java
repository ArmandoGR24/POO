/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto_1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Reto_1 {

    public static void main(String[] args) 
    {
        //Se declaran las variables
        double numero1;
        double numero2;
        double resultado;
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        
        //Muestra la lista de opciones y lee los datos del usuario
        System.out.println("Lista de Opciones");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.División");
        System.out.print("Ingresa una opcion: ");
        opcion = entrada.nextInt();
        System.out.print("Ingresa el numero 1: ");
        numero1 = entrada.nextDouble();
        System.out.print("Ingresa el numero 2: ");
        numero2 = entrada.nextDouble();
        
        /*El switch es una funcion resumida del IF que usa condicionales
          con la variable de opciones para hacer la operacion necesaria
        */
        switch(opcion)
        {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("Opcion ingresada no valida");
                break;
        }
        
    }
    
}

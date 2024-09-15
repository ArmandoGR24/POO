
package Arreglos7;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class Arreglos_7 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Variable de arreglo de tipo char
        char mayusculas[] = new char[26];
        for(int i = 65,j = 0; i <= 90;i++,j++)
        {
            mayusculas[j] = (char) i ;
        }
        
        String cadena = "";
        int eleccion = 1;
        
        //Condicion de repetir
        do
        {
            System.out.println("Elija un indice entre 0 y " + (mayusculas.length-1));
            eleccion = sc.nextInt();
            
            //Se cumplira si el valor leido es mayor a 25
            if(!(eleccion >= 0 && eleccion <= mayusculas.length - 1))
            {
                System.out.println("Error, inserte otro numero");
            }
            //Guarda el valor dentro de la array
            else
            {
                if(eleccion != -1)
                {
                    cadena += mayusculas[eleccion];
                }
            }
            //Imprime el numero de la cadena
        }while(eleccion != -1);
                {
                    System.out.println(cadena);
                }
    }
    
}

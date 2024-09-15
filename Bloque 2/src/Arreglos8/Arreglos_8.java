package Arreglos8;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class Arreglos_8 {

    public static void main(String[] args) 
    {
        //Iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        
        //Variable para guardar lo leido en la terminal
        String frase = sc.nextLine();   
        
        //Variable para el arreglo bidimencional
        char caracteres[] = new char[frase.length()];
        
        //Ciclo para impimir el arreglo en la terminal
        for(int i = 0;i<frase.length();i++)
        {
            caracteres[i] = frase.charAt(0);
            System.out.println(caracteres[i]);
        }   
    }
}

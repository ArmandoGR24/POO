package For;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class For {

    public static void main(String[] args) 
    {
       
        Scanner entrada = new Scanner(System.in);
        String palabra;
        //Ingresamos una palabra 
        System.out.println("Ingrese una palabra");
        palabra = entrada.next();
        
        //Este ciclo desordena las letras segun el tamaño de la palabra
        for(int i = 0;i<palabra.length();i++)
        {
            palabra = palabra.substring(i) + palabra.charAt(0);
            System.out.println("Mover letras: " + palabra);
        }
    }
    
}

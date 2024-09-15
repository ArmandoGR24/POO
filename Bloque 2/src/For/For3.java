package For;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class For3 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        String nombres[] = new String [6];
        //En este cliclo leemos los nombres de la terminal para guardarlos en el array
        for(int i = 0; i < 6;i++)
        {
            System.out.println("Ingresa el nombre: " + i );
            nombres[i] = entrada.next();
        }
        //Imprimimos todos los nombres que se guardaron en el arrelgo
        for(int x = 0; x<nombres.length;x++)
        {
            System.out.println("Nombre: " + nombres[x]);
        }
    }
    
}

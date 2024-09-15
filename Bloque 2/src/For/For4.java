package For;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class For4 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        System.out.println("Primero guardamos la info en el arreglo: ");
        
        //Se guarda los numeros dentro del arreglo
        for(int i = 0; i<5; i++)
        {
            System.out.println((i+1)+ "Digite un numero");
            numeros[i] = entrada.nextFloat();
        }
        //Imprimimos el arreglo en la terminal
        System.out.println("\nMostramos los componentes del arrelgo");
        for(float i: numeros)
        {
            System.out.println("Numeros: " + i);
        }
    }
    
}

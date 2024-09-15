
package Arreglo3;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class Arrelgo3 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe un numero entre 0-9: ");
        int columnas = entrada.nextInt();
        
        //Variable de arreglo con 3 filas y las columnas que ingrese el usuario
        int matriz[][] = new int[3][columnas];
        
        /*Ciclos para ingresar los numeros aleatorios en el arreglo
          y imprimirlos en la terminal
        */
        for(int i=0;i<matriz.length;i++)
        {
            for(int f=0;f<matriz[0].length;f++)
            {
                matriz[i][f] = generaNumAleatorio(0,9);
                System.out.print(matriz[i][f]+"");
            }
            System.out.println("");
        }
    }
    
    //Metodo para generar numeros aleatorios para ingresarlos al arreglo
    public static int generaNumAleatorio(int min, int max)
    {
        return (int)Math.floor(Math.random()*(min-(max+1))+(max+1));
    }
}

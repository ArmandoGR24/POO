
package trycatch;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class trycatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,resultado;
        Scanner entrada = new Scanner(System.in);
        
        try
        {
            System.out.print("Ingresa el numero 1: ");
            n1 = entrada.nextInt();
            System.out.print("Ingresa el numero 2: ");
            n2 = entrada.nextInt();
            resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);
        }
        catch(Exception e){ System.out.println("Error: " + e);}
        finally{System.out.println("Operacion terminada");}
        
    }
    
}

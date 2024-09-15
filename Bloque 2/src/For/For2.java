package For;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class For2 {
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int limite;
        //Ingresamos un limite 
        System.out.println("Digite hasta que numero quiere que apareca en pantalla");
        limite = entrada.nextInt();
        //El ciclo imprime los numeros hasta que alcanze el limite asignado
        for(int i = 0;i<= limite;i++)
        {
            System.out.println(i);
        }
    }
    
}

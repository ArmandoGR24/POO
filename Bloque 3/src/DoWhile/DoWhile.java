
package DoWhile;

import java.util.Scanner;

/**
 *
 * @author ArmandoGR
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int i = 0, limite;
        
        System.out.println("Escriba hasta que numero quiere que aparesca en "
                + "la pantalla");
        
        limite = sc.nextInt();
        //El ciclo se repetira hasta que llege hasta el limite
        
        do{
            System.out.println(i);
            i++;
        }while(i<=limite);
    }
    
}

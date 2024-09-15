package Arreglo2;
/**
 *
 * @author ArmandoGR
 */
public class Arreglo2 {

    public static void main(String[] args) 
    {
        //Varible del arreglo multidimencional
        int matriz[][]= new int[5][5];
            
            //Ciclo para usar el arreglo
            for(int i = 0;i<matriz[0].length;i++)
            {
                /* Ciclo para ingresar datos en el arreglo
                   y imprimir datos en la terminal
                */
              for(int x = 0;x<matriz[0].length;x++)
              {
                  matriz[i][x] = (i+matriz.length)+(x+1);
                  System.out.print(matriz[i][x]+"");
              }
              
                System.out.println("");
            }
        
    }
    
}

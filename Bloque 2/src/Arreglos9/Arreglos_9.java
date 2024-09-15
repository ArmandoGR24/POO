package Arreglos9;

/**
 *
 * @author ArmandoGR
 */
public class Arreglos_9 {
    public static void main(String[] args) 
    {
        //Declaramos las variables en tipo Array con los datos
       String nombres[] = {"Victor", "Ronald","Carolina", "Paola"};
       int edad[] = {25,30,19,22};
       char sexo[] = {'M','M','M','F'};
       
        //Imprimimos en la consola los datos de los Arrays 
        System.out.println("Datos de los usuarios"); System.out.println("Nombres Edad Sexo");
        System.out.println("-------- ---- --------");
        //Este ciclo imprime cada uno de los espacios del array
        for(int u = 0;u<nombres.length;u++)
        {
            System.out.println(nombres[u] + "-" + edad[u] + "-" + sexo[u]);
        }
    }    
}

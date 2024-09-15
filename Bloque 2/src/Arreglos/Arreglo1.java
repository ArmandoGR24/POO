
package Arreglos;
/**
 *
 * @author ArmandoGR
 */
public class Arreglo1 
{

    public static void main(String[] args) 
    {
        /*
            Creamos las vaariables de arreglos bidimencionales 
            y ingresamos los datos de los arreglos
        */
       String utiles[] = {"Pelota", "Zapatilla","Mochila","Polo"};
       double precios[] = {35.5,89.60,45.99,25.70};
       
        System.out.println("Lista de productos y sus precios");
            
            //Imprimimos los datos de cada posicion que tiene en el arreglo
            for(int i = 0;i<utiles.length;i++)
            {
                System.out.println(utiles[i] + " " + precios[i]);
            }
    }
}

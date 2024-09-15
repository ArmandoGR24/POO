
package Arreglos4;

import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Arreglos_4 {

    public static void main(String[] args) 
    {
        //Se define el tamaño del arreglo
        final int tamaño = 3;
        int num[] = new int[tamaño];
        
        rellenarArray(num);
        mostrarArray(num);
        
    }
    
    public static void rellenarArray(int lista[])
    {
        //Ingresamos los numeros hasta que completemos el tamaño del arreglo
        for(int i = 0;i<lista.length;i++)
        {
            String texto = JOptionPane.showInputDialog("Introduce un número");
            lista[i] = Integer.parseInt(texto);
        }
    }
    
    public static void mostrarArray(int lista[])
    {
       //Imprime todo el arreglo
        for(int i = 0;i<lista.length;i++)
        {
            System.out.println("El indice: " + i + " esta el valor " + lista[i]);
        }
    }
}

package Arreglo5;

import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Arreglo_5 {

    public static void main(String[] args) 
    {
        //Leemos el tamaño con JOptionpane 
        String texto = JOptionPane.showInputDialog("Introduce el tamaño");
        int num[] = new int[Integer.parseInt(texto)];
        
        //Llamamos a los metodos y enviamos los datos necesasrios
        rellenarNumAleatorioArray(num, 0, 9);
        mostrarArray(num);
        
    }
    
    /*Este metodo genera numeros aleatorios con el maximo y minimo enviados
      y los ingresa en el array
    */
    public static void rellenarNumAleatorioArray(int lista[],int a, int b)
    {
        for(int i = 0;i<lista.length;i++)
        {
            lista[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    
    //este memtodo imprime el array con los nimeros random
    public static void mostrarArray(int lista[])
    {
        for(int i = 0;i<lista.length;i++)
        {
            System.out.println("En el indice " + i + " esta el valor ");
        }
    }
}

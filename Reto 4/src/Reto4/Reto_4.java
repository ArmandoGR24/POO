package Reto4;

import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Reto_4 {

    static int confirmacion;
    //Arreglo de tabla 
    static int tabla[][] = {{111,192,289,415},
                          {483,500,470,114},
                          {471,355,474,161},
                          {427,158,160,308}};
    
    //Arreglos de sabores
    static int array_chocolate[] = {111,483,471,427};
    static int array_Vainilla[] = {192,500,355,158};
    static int array_Fresa[] = {289,470,474,160};
    static int array_Oreo[] = {415,114,161,308};
    static int sabores[] = new int [4];
    public static void main(String[] args) 
    {    
       //Numero maximo
        
        String trimestre;
        String Trimestres[] = {"Ene-Feb-Mar","Abr-May-Jun","Jul-Ago-Sep","Oct-Nov-Dic"};
        String rep_trimestre;
        

         //Guarda el arreglo en String para mostrarlo en forma de texto
         String mostrar = "";
         for(int i = 0; i < tabla.length;i++)
         {
             mostrar += Trimestres[i] + ": ";
             
             for(int j = 0; j < tabla.length;j++)
             {
                 mostrar += tabla[i][j] + " ";
             }
             mostrar += "\n";
         }   
            confirmacion = JOptionPane.showConfirmDialog(null,"¿Los datos son correntos?\n"+ mostrar,"Datos a comparar",JOptionPane.INFORMATION_MESSAGE);
            
            if(confirmacion == JOptionPane.YES_OPTION)
            {
                //Trimestre que vende por cada sabor
                

                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
    }
    
    public static int maximo(int[] array)
    {
        int maximo = Integer.MIN_VALUE;
        

            for(int num : array)
            {
                if(num > maximo)
                {
                    maximo = num;
                }

        }
        return maximo;
    }
    public static String BuscarTrimestre(int trimestre)        
    {
        //Trimestres
        String Tri = ""; 
        
        boolean encontrar = false;
        int ubicacion = 0;
        
        for(int i = 0; i < tabla.length; i++)
        {
            for(int j = 0;j < tabla[i].length;j++)
            {
                if (tabla[i][j] == trimestre)
                {
                    ubicacion = i;
                    encontrar = true;
                }
            }
        }
        if(ubicacion == 0)
        {
            Tri = "Enero-Febrero-Marzo";
        }
        if(ubicacion == 1)
        {
            Tri = "Abril-Mayo-Junio";
        }
        if(ubicacion == 2)
        {
            Tri = "Julio-Agosto-Septiembre";
        }
        if(ubicacion == 3)
        {
            Tri = "Octubre-Noviembre-Diciembre";
        }
        return Tri;
    }
    public static void SaboresMAx()
    {
        int Max_cho,Max_Vaini,Max_Fresa,Max_Oreo;
        Max_cho =maximo(array_chocolate);
        Max_Fresa = maximo(array_Fresa);
        Max_Oreo = maximo(array_Oreo);
        Max_Vaini = maximo(array_Vainilla);
        sabores[0] = Max_cho;
        sabores[1] = Max_Vaini;
        sabores[2] = Max_Fresa;
        sabores[3] = Max_Oreo;
        
                
        
    }
    
}

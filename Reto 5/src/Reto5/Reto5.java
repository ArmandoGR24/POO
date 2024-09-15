package Reto5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author armando
 */
public class Reto5 
{
    public static void main(String[] args) 
    {
        final int Intentos_Totales = 12;
        int intentos = 0;
        int aciertos = 0;
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        char resp;
        
        //Escoje una palabra a lazar
        Random rnd = new Random();
        String Niveles[] = new String [3];
        //Nivel facil
        Niveles[0] = "casa";
        //Nivel Intermedio
        Niveles[1] = "carpeta";
        //Nivel Avanzado
        Niveles[2] = "Extraordinario";
        do{   
            //Separa las palabras y las guarda en el arrelgo de caracteres
            System.out.println("Elige el nivel}"
                    + "\n 1. Facil"
                    + "\n 2. Intermedio"
                    + "\n 3. Avanzado"
                    + "\n 0.Salir");  
            int lvl  = sc.nextInt();
            //Busca si hay un cero para cerrar el programa
            if(lvl == 0)
            {
                System.out.println("Saliendo del programa");
                System.exit(0);
            }
            //si no sige con la eleccion del nivel
            else
            {
               lvl = lvl - 1;
            }
            //Se elige la palabra segun el nivel que se escogio 
            char[] desguazada = desguaza(Niveles[lvl]);
            char [] copia = desguaza(Niveles[lvl]);
            //arreglo para impimir los caracteres
            char[] tusRespuestas = new char[desguazada.length];
            //Se rellenan las palabras con guiones
            for(int i = 0; i< tusRespuestas.length; i++)
            {
                tusRespuestas[i] = '*';
            }
            //Empezamos a imprimir en la pantalla
            System.out.println("Adivina la palabra!");
            //Mientras que no nos pasemos de intentos y no acertemos
            while(intentos < Intentos_Totales && aciertos != tusRespuestas.length)
        {
                imprimeOculta(tusRespuestas);
                //preguntamos por Scanner
                    System.out.println("\n Introduce una letra: ");
                    resp = sc.next().charAt(0);
                    
                    //Excepciones agregadas ( ͡❛ ͜ʖ ͡❛)✌
                    
                    //Si lee una letra
                    if(Character.isLetter(resp))
                    {
                     //Se recorre el array y comprobamos si tenemos un acierto
                    for(int i = 0; i< desguazada.length;i++)
                    {
                       if(desguazada[i]==resp)
                       {
                           tusRespuestas[i] = desguazada[i];
                           desguazada[i] =' ';
                           aciertos++;
                       }
                    }
                    }
                    //Si no le una letra
                    else
                    {
                        //Si no es una letra pero es un 0
                        if(resp  == '0')
                        {
                            System.out.println("Saliendo del programa");
                            System.exit(0);
                        }
                        
                        //No es una letra pero tampoco un 0
                        System.out.println("No es una letra valida");
                        System.out.println("\n");
                       
                    }
                    //Aumentamos el contador de intentos
                    intentos++;
                            
        }
          //Si acertamos todas imprimimos el mensaje
        if(aciertos == tusRespuestas.length)
        {
            System.out.println("\n Felicidades has acertado las palabra: ");
            imprimeOculta(tusRespuestas);
            System.out.println("(👍 ͠❛ ͜ʖ ͠❛ )👍");
            
        }
        //si no acertaste
        else
        {
            System.out.println("\n Fallaste, la palabra era: ");
            for(int i = 0; i< copia.length;i++)
            {
                System.out.print(copia[i] + " ");
            }
            System.out.println("¯\\_( ͡❛ ͜ʖ ͡❛)_/¯");
        }
        //Se resetean los contadores
        intentos = 0;
        aciertos = 0;
        //Preguntamos al usuario si quiere volver a jugar
        resp = pregunta("\n Quieres volver a jugar?",sc);
    
        }while(resp != 'n');  
    }
    
   private static char[] desguaza(String palAzar)
{
    char[] letras;
    letras = new char[palAzar.length()];
    for(int i = 0; i < palAzar.length();i++)
    {
      letras[i] = palAzar.charAt(i);
    }
    return letras;
} 
   
   //Imprime la palabra con espacios 
   private static void imprimeOculta(char[] tusRespuestas)
   {
       for(int i = 0; i < tusRespuestas.length;i++)
       {
           System.out.print(tusRespuestas[i] + " ");
       }
   }
   //Funcion para preguntar si queremos volver a jugar
   public static char pregunta(String men,Scanner sc)
   {
       char resp;
       System.out.println(men + "(s/n)");
       resp = sc.next().toLowerCase().charAt(0);
       while(resp != 's'&& resp!= 'n')
       {
           System.out.println("Error! solo se admimite S o N");
           resp = sc.next().toLowerCase().charAt(0);
       }
       return resp;  
   }
   
   
}

package Reto_6;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author arman
 */
import javax.swing.JOptionPane;

public class Reto6 {
    
    static String ganar ="░░░░░░░░░░░███████░░░░░░░░░░░\n"
            + "░░░░░░░████░░░░░░░████░░░░░░░\n"
            + "░░░░░██░░░░░░░░░░░░░░░██░░░░░\n"
            + "░░░██░░░░░░░░░░░░░░░░░░░██░░░\n"
            + "░░█░░░░░░░░░░░░░░░░░░░░░░░█░░\n"
            + "░█░░████░░░░░░░░██████░░░░░█░\n"
            + "█░░█░░░██░░░░░░█░░░░███░░░░░█\n"
            + "█░█░░░░░░█░░░░░█░░░░░░░█░░░░█\n"
            + "█░█████████░░░░█████████░░░░█\n"
            + "█░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n"
            + "█░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n"
            + "█░░░████████████████████░░░░█\n"
            + "░█░░░█▓▓▓▓▓▓▓▓█████▓▓▓█░░░░█░\n"
            + "░█░░░░█▓▓▓▓▓██░░░░██▓██░░░░█░\n"
            + "░░█░░░░██▓▓█░░░░░░░▒██░░░░█░░\n"
            + "░░░██░░░░██░░░░░░▒██░░░░██░░░\n"
            + "░░░░░██░░░░███████░░░░██░░░░░\n"
            + "░░░░░░░███░░░░░░░░░███░░░░░░░\n"
            + "░░░░░░░░░░█████████░░░░░░░░░░";
    
    static String perdiste = "───────▄▀▀▀▀▀▀▀▀▀▀▄▄\n"
            + "────▄▀▀░░░░░░░░░░░░░▀▄\n"
            + "──▄▀░░░░░░░░░░░░░░░░░░▀▄\n"
            + "──█░░░░░░░░░░░░░░░░░░░░░▀▄\n"
            + "─▐▌░░░░░░░░▄▄▄▄▄▄▄░░░░░░░▐▌\n"
            + "─█░░░░░░░░░░░▄▄▄▄░░▀▀▀▀▀░░█\n"
            + "▐▌░░░░░░░▀▀▀▀░░░░░▀▀▀▀▀░░░▐▌\n"
            + "█░░░░░░░░░▄▄▀▀▀▀▀░░░░▀▀▀▀▄░█\n"
            + "█░░░░░░░░░░░░░░░░▀░░░▐░░░░░▐▌\n"
            + "▐▌░░░░░░░░░▐▀▀██▄░░░░░░▄▄▄░▐▌\n"
            + "─█░░░░░░░░░░░▀▀▀░░░░░░▀▀██░░█\n"
            + "─▐▌░░░░▄░░░░░░░░░░░░░▌░░░░░░█\n"
            + "──▐▌░░▐░░░░░░░░░░░░░░▀▄░░░░░█\n"
            + "───█░░░▌░░░░░░░░▐▀░░░░▄▀░░░▐▌\n"
            + "───▐▌░░▀▄░░░░░░░░▀░▀░▀▀░░░▄▀\n"
            + "───▐▌░░▐▀▄░░░░░░░░░░░░░░░░█\n"
            + "───▐▌░░░▌░▀▄░░░░▀▀▀▀▀▀░░░█\n"
            + "───█░░░▀░░░░▀▄░░░░░░░░░░▄▀\n"
            + "──▐▌░░░░░░░░░░▀▄░░░░░░▄▀\n"
            + "─▄▀░░░▄▀░░░░░░░░▀▀▀▀█▀\n"
            + "▀░░░▄▀░░░░░░░░░░▀░░░▀▀▀▀▄▄▄▄▄";

    
    
    public static void main(String[] args) {
        String[] palabras = new String[3];
        //Palabras de niveles
        //Facil
        palabras[0] = "casa";
        //Intermedio
        palabras[1] = "elefante";
        //Avanzado
        palabras[2] = "extraordinario";
        char repetir = 's';
        
        do{
        //Elegir el nivel
        int nivel = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nivel: "
                + "\n 1.Facil" + "\n 2.Intermedio" + "\n 3.Avanzado" + "\n 0.Salir"));
        if (nivel == 0)
        {
            System.exit(0);
        }
        String palabra = palabras[(nivel-1)];
        String guiones = "";
        int intentos = 5;
        
        //Oculta la palabra con *S1111111111111111111111
        for (int i = 0; i < palabra.length(); i++) {
            guiones += "* ";
        }
        //bucle del programa
        while (intentos > 0 && guiones.contains("*")) {
            //Imprime la palabra oculta y resibe los caracteres
            String letra = JOptionPane.showInputDialog("Adivina la palabra: " + guiones + "\nIngresa una letra:");
            
            //Si no introduce nada o no es un caracter 
            if (letra == null || letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                int salir = Integer.parseInt(letra);
                if(salir == 0)
                {
                    JOptionPane.showMessageDialog(null, "Cerrando Juego");
                    System.exit(0);
                }
                continue;
            }
            letra = letra.toLowerCase();
            //Si es caracter lo busca en la palabra base
            if (palabra.contains(letra)) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) {
                        guiones = guiones.substring(0, 2 * i) + letra + guiones.substring(2 * i + 1);
                    }
                }
                //si no resta un intento total
            } else {
                intentos--;
            }
        }
        //Si ganas 
        if (intentos > 0) {
            JOptionPane.showMessageDialog(null, "¡Ganaste! La palabra era: " + palabra + "\n" + ganar);
            repetir = JOptionPane.showInputDialog("Desea volver a jugar (s/n)").charAt(0);
        } 
        //Si pierdes
        else {
            JOptionPane.showMessageDialog(null, "¡Perdiste! La palabra era: " + palabra +"\n" + perdiste);
            repetir = JOptionPane.showInputDialog("Desea volver a jugar (s/n)").charAt(0);
        }
        }while(repetir == 's');
        }
        
}


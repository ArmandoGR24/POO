package Reto_2_1;

import java.util.Scanner;



/**
 *
 * @author ArmandoGR
 */
public class Reto_2_1 {

    public static void main(String[] args) {
        //Variables del programa
        int Adulto = 100;
        int ninos = 70;
        int inapam = 50;
        int Admy = 70;
        char repetir = 's';
        char opciones;
        
        
        Scanner entrada = new Scanner(System.in);
        
        //utilizo el condicional while para repetir el programa en caso de otro boleto
        while(repetir == 's'){
            //Opciones de los boletos
        System.out.println("Elije un Tipo de boleto");
        System.out.println("A.Adulto");
        System.out.println("N.Niños");
        System.out.println("I.Inapam");
        System.out.println("B.Adulto Mayor");
        
        System.out.print("Tipo de boleto a Adquirir: ");
        opciones = entrada.next().charAt(0);
            
            //Condicional Switch para hacer cada paso segun el boleto elegido
            switch(opciones)
            {
            case 'A':
                System.out.println("El precio del boleto es de $120.00");
                System.out.print("¿Otro boleto? s/n: ");
                repetir = entrada.next().charAt(0);
                break;
            case 'N':
                System.out.println("El precio del boleto es de $70.00");
                System.out.print("¿Otro boleto? s/n: ");
                repetir = entrada.next().charAt(0);
                break;
            case 'I':
                System.out.println("El precio del boleto es de $50.00");
                System.out.print("¿Otro boleto? s/n: ");
                repetir = entrada.next().charAt(0);
                break;
            case 'B':
                System.out.println("El precio del boleto es de $70.00");
                System.out.print("¿Otro boleto? s/n: ");
                repetir = entrada.next().charAt(0);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
            }
        }
    }
    
}

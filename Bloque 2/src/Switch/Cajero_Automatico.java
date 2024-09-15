
package Switch;

import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Cajero_Automatico {

    public static void main(String[] args) 
    {
        //Variables
        int saldo_inicial = 0;
        int opcion;
        float ingreso,saldo_a = 0,retiro;
        
        //Menu de opciones para el programa
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
                + "1. Ingresa dinero a la cuenta\n"
                + "2. Retira dinero de la cuenta\n"
                + "3. Salir"));
        
        //Switch para leer opcion para realizar cada operacion segun el numero leido
        switch(opcion)
        {
            //Caso para ingresar dinero en la cuenta
            case 1:
                try{
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite la cntidad que desea depositar a la cuenta"));
                saldo_a = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en la cuenta: " + saldo_a);
                }
                catch(Exception e){JOptionPane.showMessageDialog(null, "Error: " + e);}
                finally{}
                break;
                //Caso para retirar dinero
            case 2:
                try{
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a retirar"));
                if(retiro>saldo_inicial)
                {
                    JOptionPane.showMessageDialog(null, "Fondos insuficiente, tu saldo actual es de: " + saldo_a);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: " + saldo_a);
                }
                }
                catch(Exception a){JOptionPane.showMessageDialog(null, "Error: " + a);}
                finally{}
                break;
                //Caso para salir
            case 3: break;
            default : JOptionPane.showMessageDialog(null, "Opcion invalida");
                
        }
        
    }
    
}

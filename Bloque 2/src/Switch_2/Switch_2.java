package Switch_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Switch_2 {

    public static void main(String[] args) 
    {
        //Variables del programa
        int dato;
        
        //Ingresamos los datos con la funcion JOtionpane 
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un nuero entre 1-5"));
        
        //Leemos el dato ingresado anterior mente y buscamos con el caso que coincida
        switch(dato)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Esta es la opcion 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Esta es la opcion 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Esta es la opcion 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Esta es la opcion 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Esta es la opcion 5");
                break;
                /*
                    El default es para que el programa no entre en un bucle de 
                    repeticion en caso de no coincidir con los case los datos 
                    ingresados
                */
            default: 
                JOptionPane.showMessageDialog(null, "Por favor selecione una opcion dentro del menu");
                break;
        }
    }
}

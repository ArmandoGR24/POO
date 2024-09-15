 package Reto_3;
import javax.swing.JOptionPane;

/**
 *
 * @author ArmandoGR
 */
public class Reto3 {
    //Este es el metodo para convertir decimal a binario
    public static String decimalBinario(int decimal)
    {
        String binario = "";
        while(decimal > 0)
        { 
            //Se opciene el residuo del decimal 
            int operacion = decimal % 2;
            //Se agrrega al binario
            binario = operacion + binario;
            //Se divide el numero para seguir con el residuo
            decimal = decimal /2;
        }
        return binario;
    }
    //Metodo para convertir decimal a octal
    public static String decimalOctal(int decimal)
    {
        String octal = "";
        while(decimal > 0)
        {
            int operacion = decimal % 8;
            octal = operacion + octal;
            decimal = decimal / 8;
        }
        return octal;
    }
    //Metodo para convertir decimal a hexadecimal
    public static String decimalHexa(int numero)
    {
        String hexa = "";
        char[] numhexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (numero > 0)
        {
            int operacion = numero % 16;
            hexa = numhexa[operacion] + hexa;
            numero = numero / 16;
        }
        return hexa;
    }
    //Metodo para convertir el binario a decimal
    public static int binariodecimal(String binario)
    {
        int decimal = 0;
        int contador = 0;
        
         for (int i = binario.length() - 1; i >= 0; i--) {
        if (binario.charAt(i) == '1') {
            decimal += Math.pow(2, contador);
        }
        contador++;
        }
        return decimal;
    }
    //Metodo para convertir de octal a decimal
    public static int octaldecimal(String octal)
    {   
        int decimal = Integer.parseInt(octal,8);
        return decimal;
    }
    //Metodo para convertir hexadecimal a decimal
    public static int hexadec(String hexa)
    {
        int decimal = Integer.parseInt(hexa,16);
        return decimal;
    }
    
    //Estas son las instrucciones del programa
    public static void main(String[] args) 
    {
        char opciones = 0;
        int convertir,res;
        String conv;
        String resultado;
        char repetir = 's';
            
try{
        while(repetir == 's')
                {   
           
            //Lista de opciones del programa
            opciones = JOptionPane.showInputDialog(null,"Elije opciones de conversion: "
            + "\na.Convertir de decimal a binario"
            + "\nb.Convertir de decimal a octal"
            + "\nc.Convertir de decimal a Hexadecimal"
            + "\nd.Convertir de binario a decimal"
            + "\ne.Convertir de octal a decimal"
            + "\nf.Convertir de Hexadecimal a decimal").charAt(0);
            opciones = Character.toLowerCase(opciones);
                
                
            switch(opciones){
                 
                case 'a':
                    try{
                    //Esta es la condicional para convertir decimal a binario
                    convertir = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero decimal a convertir: "));
                    //Envia los datos de la variable convertir al metodo deseado
                    resultado = decimalBinario(convertir);
                    JOptionPane.showMessageDialog(null,"El numero " + convertir + " en binario es: " + resultado);
                    repetir = JOptionPane.showInputDialog(null,"¿Otra convercion? s/n: ").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception a){JOptionPane.showMessageDialog(null, "Error de Interacion");}
                    finally{}
                    break;
                    
                case 'b':
                    try{
                    //Esta es la condicional para convertir decimal a octal
                    convertir = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero decimal a convertir: "));
                    //Envia los datos de la variable convertir al metodo deseado
                    resultado = decimalOctal(convertir);
                    JOptionPane.showMessageDialog(null,"El numero decimal " + convertir + ", en octal es: " + resultado);
                    repetir = JOptionPane.showInputDialog("¿Otra convercion? s/n: ").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception b){JOptionPane.showMessageDialog(null, "Error de Interaccion");}
                    finally{}
                    break;
                    
                case 'c':
                    try{
                    //Convierte el numero decimal a hexadecimal
                    convertir = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero decimal a convertir: "));
                    resultado = decimalHexa(convertir);
                    JOptionPane.showMessageDialog(null,"El numero decimal: " + convertir + ", en hexadecimal es: " + resultado);
                    repetir = JOptionPane.showInputDialog("¿Otra convercion? s/n:").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception c){JOptionPane.showMessageDialog(null, "Error de Interaccion");}
                    finally{}
                    break;
                    
                case 'd':
                    try{
                    //Esta es la condicional para convertir binario a decimal
                    conv = JOptionPane.showInputDialog("Ingresa el numero binario a convertir:");
                    res = binariodecimal(conv);
                    JOptionPane.showMessageDialog(null, "El numero binario: " + conv + " es: " + res + " en decimal");
                    repetir = JOptionPane.showInputDialog("¿Otra convercion? s/n:").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception d){JOptionPane.showMessageDialog(null, "Error de Interraccion");}
                    finally{}
                    break;
                    
                case 'e':
                    try{
                    //Esta es la condicional para convertir octal a decimal
                    conv = JOptionPane.showInputDialog("Ingresa el numero octal a convertir:");
                    res = octaldecimal(conv);
                    JOptionPane.showMessageDialog(null, "El numero octal: " + conv + " , es: " + res + " en decimal");
                    repetir = JOptionPane.showInputDialog("¿Otra convercion? s/n:").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception e){JOptionPane.showMessageDialog(null, "Error de Interaccion");}
                    finally{}
                    break;
                    
                case 'f':
                    try{
                    //Esta es la condicional para convertir hexadecimal a decimal
                    conv = JOptionPane.showInputDialog("Ingrese el numero Hexadecimal:");
                    res = hexadec(conv);
                    JOptionPane.showMessageDialog(null, "El numero hexadecimal:" + conv + " , es: " + res + " en decimal");
                    repetir = JOptionPane.showInputDialog("¿Otra convercion? s/n:").charAt(0);
                    repetir = Character.toLowerCase(repetir);
                    }
                    catch(Exception f){JOptionPane.showMessageDialog(null, "Error de Interracion");}
                    finally{}
                    break;
                default:
                    
                    break;
            }
            }
                
            }
            catch(Exception o){JOptionPane.showMessageDialog(null, "Error de opciones");
                    
            }
            finally{}
    }        
    }

    


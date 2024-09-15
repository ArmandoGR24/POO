
package Vehiculo;

/**
 *
 * @author ArmandoGR
 */
public class VehiculoDeportivo extends Vehiculo
{
    private int Cfuerza; //Caballos de fuerza
    
    public VehiculoDeportivo(int CFuarza,String matricula,String marca,String modelo)
    {
        super(matricula,modelo,marca);
        this.Cfuerza = CFuarza;
    }
    
    public int getFuerza()
    {
        return Cfuerza;
    }
    public String mostrarDatos()
    {
        return "Matricula" + getMatricula() + "\nMarca: " + getmarca() + "Modelo: " + getmodelo() + "\nModelo: "
                + getmodelo() + "\nLos caballos de fuerza que posee son: " + Cfuerza;
    }
    
    
}

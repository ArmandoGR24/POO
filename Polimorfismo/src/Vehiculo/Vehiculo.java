package Vehiculo;

/**
 *
 * @author ArmandoGR
 */
public class Vehiculo 
{
    private String Matricula;
    private String marca;
    private String modelo;
    
    public Vehiculo(String Matricula,String marca,String modelo)
    {
        this.Matricula = Matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMatricula()
    {
        return Matricula;
    }
    public String getmarca()
    {
        return marca;
    }
    public String getmodelo()
    {
        return modelo;
    }
    public String MostrarDatos()
    {
        return "Matricula: " + Matricula + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}

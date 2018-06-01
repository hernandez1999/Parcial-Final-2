
package parcial;

public class Carro 
{
    private String placa;
    private String propietario;
    private float cilindraje;

    public Carro(String placa, String propietario, float cilindraje) 
    {
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
    }
    
    //Para buscar con placa
    public String getPlaca() 
    {
        return placa;
    }

    public String getPropietario() 
    {
        return propietario;
    }

    public float getCilindraje() 
    {
        return cilindraje;
    }   

}  


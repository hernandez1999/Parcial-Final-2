
package parcial;

public class Parqueadero 
{
 
 private Carro[] carros = new Carro[100];

 public boolean parquearCarro(Carro carro) 
 {
  for (int i = 0; i < carros.length; i++) 
  {
   if (carros[i] == null)
   {
    carros[i] = carro;
    return true;
   }
  }
  return false;
 }

 public boolean retirarCarro(String placa)
 {
  for (int i = 0; i < carros.length; i++) 
  {
   if (carros[i] != null)
   {
    if (carros[i].getPlaca().equals(placa))
    {
     carros[i] = null;
     return true;
    }
   }
  }
  return false;
 }
 
 /**
  * Método para buscar un carro en el parqueadero, dada la placa.
  * @param placa la placa del carro que se desea buscar
  * @return  el carro (si se encuentra) o null si no se encuentra
  */
 public Carro buscarCarro(String placa)
 {
  for (int i = 0; i < carros.length; i++) 
  {
   if (carros[i] != null)
   {
    if (carros[i].getPlaca().equals(placa))
    {
     return carros[i];
    }
   }
  }
  return null;
 }

} 


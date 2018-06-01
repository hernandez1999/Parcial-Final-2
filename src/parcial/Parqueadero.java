
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

 public Carro mostrarCupos(String placa)
 {
  for (int i = 0; i < carros.length; i++) 
  {
     return carros[i];
  }
     return null;
 }
} 


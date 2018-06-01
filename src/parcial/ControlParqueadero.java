
package parcial;

import javax.swing.*;

public class ControlParqueadero 
{
    
    Parqueadero parquea = new Parqueadero();

    public void parquearCarro() 
    {
            String placa = JOptionPane.showInputDialog("Placa del carro: (Solo paraverificar que el carro no este en el parqueadero)");
            // Verifica que el carro ya no esté parqueadao
            
            if (parquea.buscarCarro(placa) == null) 
            {
                String propietario = JOptionPane.showInputDialog("Placa del carro:");
                String propietarioCadena = JOptionPane.showInputDialog("Propietario del carro:");
                float cilindraje = Integer.parseInt(propietarioCadena);
                Carro nuevo = new Carro(placa, propietario, cilindraje);
                boolean pudoParquear = parquea.parquearCarro(nuevo);
                if (pudoParquear) 
                {
                   JOptionPane.showMessageDialog(null,"El carro fue ingresado exitosamente.");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"No fue posible ingresar el carro. Intente más tarde");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Ya hay un carro parqueado con esa placa.");
            }
    }
    

    public void buscarCarro() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        Carro carro = parquea.buscarCarro(placa);
        if (carro == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del carro son:  \n" +
                                    "Placa: "+ carro.getPlaca() + "\n"+
                                    "Propietario: "+ carro.getPropietario());
        }
    }

    public void retirarCarro() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        boolean pudoSacar = parquea.retirarCarro(placa);
        if (pudoSacar) 
        {
            JOptionPane.showMessageDialog(null,"El carro se retiró del parqueadero exitosamente");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
    }


    public void menu() {
        
        int opcion=-1;
        do {
            String valorSeleccionado = 
            JOptionPane.showInputDialog(" ---- MENU PARQUEADERO ---  \n" +
                        "1.Ingresar un carro    \n" +
                        "2.Mostrar un carro  \n" +
                        "3.Retirar un carro   \n" +
                        "0.Salir     \n\n" +
                        "Opción seleccionada: ");
            try 
            {
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                    // Opcion 1: Parquear un carro
                    case 1: parquearCarro();
                            break;
                    
                    // Opcion 2: Buscar un carro y mostrar sus datos 
                    case 2: buscarCarro();
                            break;
                    
                    // Opcion 3: Sacar un carro del parqueadero
                    case 3: retirarCarro();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opción no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser numérico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminación exitosa -");

    }

} 


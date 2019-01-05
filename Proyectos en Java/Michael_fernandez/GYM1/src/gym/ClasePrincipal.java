/*
    Grupo Programacion orientada a objetos.
    Ulimited Gym.
    
    Nombres: Michael Fernández Ortega Rut: 18.916.791-1.
             David Erazo Martinez     Rut:18.788.484.5
        
*/
package gym;
import Ventanas.Interfaz;



public class ClasePrincipal 
{
    
    public static void main(String[] args)
    {
       
        GYM gym = new GYM();
        Interfaz iniciar = new Interfaz(gym);
        iniciar.setVisible(true); 
       
    
    }
}

package gym;

import java.util.ArrayList;

public class ListaCliente 
{


    public ArrayList<Cliente> getArrayCliente() {
        return arrayCliente;
    }


    public void setArrayCliente(ArrayList<Cliente> arrayCliente) {
        this.arrayCliente = arrayCliente;
    }
    
     private ArrayList<Cliente> arrayCliente; 

    public ListaCliente() {
    }
      
    
    public ListaCliente(Archivos archivo) {
        arrayCliente = archivo.cargarArchivoTextoCliente(arrayCliente);
    }
       
     
     public boolean agregaCliente(Cliente Nuevo)
     {     
            if(Nuevo!=null)
            {
                if(verificaCliente(Nuevo.getRut()) && verificaTelefono(Nuevo.getTelefono()))
                {
                    getArrayCliente().add(Nuevo);
                    return true;
                    
                }
            }
       
       return false;
     }

     
     
    public boolean verificaCliente(String rut)
    {
         for(int i=0; i<getArrayCliente().size(); i++)
         {
             if(getArrayCliente().get(i).getRut().equals(rut) == true)
             {
                 return false;
             }
                     
         }
         return true;
    }
    
    public boolean verificaCliente(String Rut, String Contraseña)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if(getArrayCliente().get(i).getRut().equals(Rut) && getArrayCliente().get(i).getContraseña().equals(Contraseña))
            {
                return true;
            }
        }
      return false;
    }
    
    
    
    public boolean verificaTelefono(int Telefono)
    {
        int Aux = Telefono, cont=0;
        
           while(Aux>0)
           {
               Aux = Aux/10;
               cont++;
           }
         
           if(cont == 8)
           {
               return true;
           }
           
      return false;
    }
    
    
    
    public Cliente buscaRut(String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if((getArrayCliente().get(i).getRut()).equals(Rut))
            {
                return getArrayCliente().get(i);
            }
        }
       return null;
    }
    
    
    
    public Cliente buscaCliente(String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if((getArrayCliente().get(i).getRut()).equals(Rut))
            {
                return getArrayCliente().get(i);
            }
                
        }
      return null;
    }
    
    
    
    public boolean eliminaCliente(String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if((getArrayCliente().get(i).getRut()).equals(Rut))
            {
                getArrayCliente().remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean modificaTelefono(int Telefono, String Rut)
    {
       for(int i=0; i<getArrayCliente().size(); i++)
       {
           if((getArrayCliente().get(i).getRut()).equals(Rut))
           {
              if(verificaTelefono(Telefono))
              {
                    getArrayCliente().get(i).setTelefono(Telefono);
                return true;
              }
           }
       }
       return false;
    }
    
    
    
    public boolean modificaDireccion(String Direccion, String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if(getArrayCliente().get(i).getDireccion().equals(Direccion))
            {
                getArrayCliente().get(i).setDireccion(Direccion);
                return true;
            }
        }
      return false;
    }
     
    
    
    public boolean modificaPlan(String Plan, String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if(getArrayCliente().get(i).getPlan().equals(Rut))
            {
                getArrayCliente().get(i).setPlan(Plan);
                return true;
            }
        }
      return false;
    }
    
    
    
    public boolean mofidicaContraseña(String Contraseña, String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if(getArrayCliente().get(i).getRut().equals(Rut))
            {
                getArrayCliente().get(i).setContraseña(Contraseña);
                return true;
            }
        }
       return false;
    }
    
    
    
    
    public boolean modificaNombre(String Nombre, String Rut)
    {
        for(int i=0; i<getArrayCliente().size(); i++)
        {
            if(getArrayCliente().get(i).getRut().equals(Rut))
            {
                getArrayCliente().get(i).setNombre(Nombre);
                return true;
            }
        }
       return false;
    }
}

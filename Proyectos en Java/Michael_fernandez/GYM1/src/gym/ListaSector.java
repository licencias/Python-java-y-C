
package gym;

import java.util.ArrayList;

public class ListaSector {


    public ArrayList<Sector> getArraySector() {
        return arraySector;
    }

    public void setArraySector(ArrayList<Sector> arraySector) {
        this.arraySector = arraySector;
    }

    
    private ArrayList<Sector> arraySector; 

    
    public ListaSector() {
    }
    
    public ListaSector(Archivos archivo)
    {
        arraySector = archivo.cargarArchivoTextoSector(arraySector);
    }


    public boolean agregarSector(Sector sec)
    {
        if(!verificaSector(sec))
        {
            getArraySector().add(sec);
            return true;
        }
      return false;
    }
    
    
    
    public boolean verificaSector(Sector sec)
    {
        for(int i=0; i<getArraySector().size(); i++)
        {
            if(getArraySector().get(i).getId()==sec.getId())
            {
                return true;
            }
        }
      return false;
    }
    
    
    
    public boolean eliminarSector(int id)
    {
        for(int i=0; i<getArraySector().size(); i++)
        {
            if(getArraySector().get(i).getId()==id)
            {
                getArraySector().remove(i);
                return true;
            }
        }
      return false;
    }
    
    
    
    public boolean modificarNombre(int id, String Nombre)
    {
        if(!verificaNombre(Nombre))
        {
            for(int i=0; i<getArraySector().size(); i++)
            {
                if(getArraySector().get(i).getId()==id)
                {
                    getArraySector().get(i).setNombre(Nombre);
                    return true;
                }
            }
        }
      return false;
    }
    
    
        
    public boolean verificaNombre(String Nombre)
    {
        for(int i=0; i<getArraySector().size(); i++)    
        {
            if(getArraySector().get(i).getNombre().equals(Nombre))
            {
                return true;
            }
        }
      return false;
    }
    
    
    
    public boolean modificarTipoEj(int id, String Tipo)
    {
        
            for(int i=0; i<getArraySector().size(); i++)
            {
                if(getArraySector().get(i).getId()==id)
                {
                    getArraySector().get(i).setTipoEjercicio(Tipo);
                    return true;
                }
            }
   
       return false;
    }
    
    
    
    public boolean verificaID(int ID)
    {
        for(int i=0; i<getArraySector().size(); i++)
        {
            if(getArraySector().get(i).getId()==ID)
            {
                return true;
            }
        }
      return false;
    }
   
    
    
    public boolean verificaTipo(String Tipo)
    {
        for(int i=0; i<getArraySector().size(); i++)
        {
            if(getArraySector().get(i).getTipoEjercicio().equals(Tipo))
            {
                return true;
            }
        }
      return false;
    }
    
    
    
    public Sector retornaSector(int id)
    {
      
        for(int i=0; i<getArraySector().size(); i++)
        {
            if(getArraySector().get(i).getId()==id)
            {
                return getArraySector().get(i);
            }
        }
      return null;
    }
}

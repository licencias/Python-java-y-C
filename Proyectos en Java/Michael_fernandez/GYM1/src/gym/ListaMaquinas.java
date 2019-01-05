package gym;
import java.util.ArrayList;

public class ListaMaquinas 
{
    private ArrayList<Maquinas> arrayMaquinas;

    
    public ListaMaquinas()
    {
        arrayMaquinas = new ArrayList<Maquinas>();
    }
    
    public ArrayList<Maquinas> getArrayMaquinas() {
        return arrayMaquinas;
    }


    public void setArrayMaquinas(ArrayList<Maquinas> arrayMaquinas) {
        this.arrayMaquinas = arrayMaquinas;
    }
    
    
    
    
    public boolean agregarMaquina(Maquinas maquina)
    {
        if(maquina!=null)
        {
            if(!verificaMaquina(maquina.getIdMaquina()))
            {
                arrayMaquinas.add(maquina);
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    public boolean verificaMaquina(int id)
    {
        for(int i=0; i<arrayMaquinas.size(); i++)
        {
            if(arrayMaquinas.get(i).getIdMaquina()==id)
            {
                return true;
            }
        }
       return false;
    }
    
    
    
    
    
    public Maquinas retornaMaquinasIdSector(int id)
    {
        for(int i=0; i<arrayMaquinas.size(); i++)
        {
            if(arrayMaquinas.get(i).getIdSector()==id)
            {
                return arrayMaquinas.get(i);
            }
        }
       return null;
    }
    
    
    
    public Maquinas retornaMaquinasIdMaquinas(int id)
    {
        for(int i=0; i<arrayMaquinas.size(); i++)
        {
            if(arrayMaquinas.get(i).getIdMaquina()==id)
            {
                return arrayMaquinas.get(i);
            }
        }
       return null;
    }
    
    
    
    
    public boolean EliminaMaquina(int id)
    {
        for(int i=0; i<arrayMaquinas.size(); i++)
        {
            if(arrayMaquinas.get(i).getIdMaquina()==id)
            {
                arrayMaquinas.remove(i);
                return true;
            }
        }
      return false;
    }
    
    
    
    
    
    
}



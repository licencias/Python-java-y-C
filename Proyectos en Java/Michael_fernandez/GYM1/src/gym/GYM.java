package gym;

import java.util.ArrayList;

public class GYM 
{
    private String Nombre;
    private Archivos archivos;
    private ListaCliente listaCliente;
    private ListaSector listaSector;
    
    public GYM() 
    {
        archivos = new Archivos();
        listaCliente = new ListaCliente(getArchivos());
        listaSector = new ListaSector(getArchivos());
        
    }
    

  
    



    public String getNombre() 
    {
        return Nombre;
    }


    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }


    public Archivos getArchivos() 
    {
        return archivos;
    }


    public void setArchivos(Archivos archivos) 
    {
        this.archivos = archivos;
    }
    

    public ListaCliente getListaCliente() 
    {
        return listaCliente;
    }

  
    public void setListaCliente(ListaCliente listaCliente) 
    {
        this.listaCliente = listaCliente;
    }


    public ListaSector getListaSector() {
        return listaSector;
    }

   
    public void setListaSector(ListaSector listaSector) {
        this.listaSector = listaSector;
    }



    
    
}

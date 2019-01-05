import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListaReceta 
{
	
	private ArrayList<Receta> arrayRecetas;
	
	
	
	public ListaReceta()
	{
		arrayRecetas= new ArrayList<Receta>();
		
	}
	
	
	
	
	
	
	//elimina una receta del txt y del ArrayList de recetas
		public boolean eliminarReceta(Receta receta,String rut)
		{					
			File raiz = new File("Universidad Catolica De Gastronomia\\Alumnos\\"+rut+"\\Recetas");
			if(raiz.exists()){
				File archivoReceta = new File(raiz,receta.getNombreReceta()+".txt");
					if(archivoReceta.delete()){
						if(arrayRecetas.remove((Receta)receta))
							return true;
					}
			}
			return false;
		}
		
		
		
		
	
		
		//retorna el largo del array
		public int largo()
		{
			return arrayRecetas.size();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//retorna la posicion de la receta en el array
		public Receta getPosReceta(int i)
		{
			if(i<arrayRecetas.size())
				return arrayRecetas.get(i);
			
			return null;
		}
		
		
		
		
		
		
		
		
		
		//verifica que la receta existe
		public boolean existe(Receta receta)
		{
			for(int i=0;i<arrayRecetas.size();i++)
			{
				//si el nombre de la receta es igual al nombre de otra receta
				if(arrayRecetas.get(i).getNombreReceta().equals(receta.getNombreReceta()))
					return true;
			}
			return false;
		}

		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		

		//agrega una receta al ArrayList de recetas
		public void agregarReceta(Receta receta)
		{		
			
			if(!existe(receta))
			{
				arrayRecetas.add(receta);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
		//llama al metodo actualizarDatosRecetas de cada receta del alumno
		public void guardarDatosReceta(Alumno alumno) throws IOException
		{			
			Archivos archivo = new Archivos();
			if(!arrayRecetas.isEmpty())
			{		
				for(int i = 0;i < arrayRecetas.size();i++)
				{
					archivo.actualizarDatosReceta(alumno,arrayRecetas.get(i));	//este metodo guarda los datos de una receta
				}
			}
		}
		
		
	
	
	
	
	
	
	
	
	//busca las recetas por el nombre
	public Object busqueda(String nombreReceta)
	{
		for(int i=0;i<arrayRecetas.size();i++)
		{
			if(nombreReceta.equals(arrayRecetas.get(i).getNombreReceta()))
				return arrayRecetas.get(i);
		}
		return null;
	}
	
	
	
	
	//modifica la receta recibida
	public boolean modificarReceta(Receta recetaClon)
	{
		Archivos archivo = new Archivos();
		
		//se busca la receta original
		Receta receta= (Receta)busqueda(recetaClon.getNombreReceta());
		if(receta==null)
			return false;
		
		//se modifican los valores nuevos a la receta principa�
		receta.setCategorias(recetaClon.getCategorias());
		receta.setNombreReceta(recetaClon.getNombreReceta());
		receta.setInstrucciones(recetaClon.getInstrucciones());
		receta.setTiempoEstimadoPreparacion(recetaClon.getTiempoEstimadoPreparacion());
		receta.setUtensilios(recetaClon.getUtensilios());
		receta.setIngredientes(recetaClon.getIngredientes());
		
		//elimina el txt antiguo de la receta
		if(archivo.eliminarRecetaTxt(receta,receta.getAutor().getRut()))	
    	{
	    	//vuelve a crear el txt con los datos nuevos
	    	try {						
	    		archivo.actualizarDatosReceta(receta.getAutor(),receta); 
	    		return true;
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
	    	
    	}
		
		return false;
	}









	public boolean existe(String buscado) 
	{
		for(int i=0;i<arrayRecetas.size();i++)
		{
			if(buscado.equals(arrayRecetas.get(i).getNombreReceta()))
				return true;
		}
		return false;
	}

	
}

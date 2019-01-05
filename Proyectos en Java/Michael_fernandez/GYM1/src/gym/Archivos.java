
package gym;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Archivos {

    public Archivos() {
        
    }
    
    
    /*METODO CARGA ARCHIVOS DE UN CLIENTE*/
    
    public ArrayList <Cliente> cargarArchivoTextoCliente(ArrayList<Cliente> arrayCliente)
    {
        File raiz = new File("UnLimited GYM\\Clientes");
        if(raiz.exists() && raiz.list()!=null)
        {
            String[]carpeta = raiz.list();
            arrayCliente = new ArrayList<Cliente>();
            for(int i=0; i<carpeta.length;i++)
            {
                try(FileReader archivoLectura = new FileReader("UnLimited GYM\\Clientes\\"+carpeta[i]+"\\DatosCliente"+carpeta[i]+".txt"))
                {
                    BufferedReader Buffer = new BufferedReader(archivoLectura);
                    if(Buffer.ready())
                    {
                        String cadena = Buffer.readLine();
                        if(cadena!=null)
                        {
                            StringTokenizer st = new StringTokenizer(cadena,"|");
                            String Nombre = st.nextToken();
                            String Rut = st.nextToken();
                            String Contraseña = st.nextToken();
                            String Direccion = st.nextToken();
                            int Edad = Integer.parseInt(st.nextToken());
                            String Plan = st.nextToken();
                            
                            arrayCliente.add(new Cliente(Nombre,Rut,Contraseña,Direccion,Edad,Plan));
                        }
                        Buffer.close();
                        archivoLectura.close();
                    }
                            
                }catch(IOException x)
                {
                    System.out.println("Error E/S "+x);
                }
            }
        }
       return arrayCliente; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*METODOS PARA ACTUALIZAR LOS ARCHIVOS DE CLIENTE*/
    public void actualizarTxtCliente(Cliente cliente) throws IOException 
    {							
	File archivoCliente;
	FileWriter fEscrit;
	BufferedWriter bEscrit;
	PrintWriter pEscrit;
		
	  archivoCliente = new File("UnLimited GYM\\Clientes\\"+cliente.getRut()+"\\DatosCliente"+cliente.getRut()+".txt");
		
	    if(archivoCliente.exists() != true)
            {
		crearCarpetaCliente(cliente);
            }

		fEscrit = new FileWriter(archivoCliente);
		bEscrit = new BufferedWriter(fEscrit);
		pEscrit = new PrintWriter(bEscrit);

		pEscrit.println(cliente.getNombre()+"|"+cliente.getRut()+"|"+cliente.getContraseña()+"|"+cliente.getDireccion()+"|"+cliente.getTelefono()+"|"+cliente.getPlan());
	
		
		
		pEscrit.close();
		bEscrit.close();
    }
    
    
    
    public void crearCarpetaCliente(Cliente cliente)
    {							
	    File carpeta = new File("UnLimited GYM\\Clientes\\"+cliente.getRut());
	    File archivo = new File(carpeta,"DatosCliente"+cliente.getRut()+".txt");
		
		if(!carpeta.exists())
                {
		    carpeta.mkdirs();
		}
		if(!archivo.exists())
                {
		    try
                    {
			archivo.createNewFile();
		    }catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
		}		
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*METODOS PARA ELIMINAR ARCHIVOS DE UN CLIENTE*/
    
    public boolean eliminarTxtCliente(Cliente cliente)
    {    	
	if(eliminarCarpetaCliente(cliente))
	{
           
            return true;
	}
	    return false;	

    }



    public boolean eliminarCarpetaCliente(Cliente cliente)
    {
        
	File carpeta = new File("UnLimited GYM\\Clientes\\"+cliente.getRut());
	  if(carpeta.exists())
          {	
              
	      File[] archivos = carpeta.listFiles();
		if(eliminarArchivos(archivos))
                {
		   if(carpeta.delete())	
                   {
                       return true;
                   }		     
                }
          }
      return false;
    }

    
    
    
    


    
    
    /*----------------------------------------------------------------------------------------*/
    
    public boolean eliminarArchivos(File []archivos)
    {
	int cont=0;						
            for(int i=0;i<archivos.length;i++)
            {
		if(archivos[i].isFile())
                {
		    if(archivos[i].delete())
                    {
			cont++;
		    }
                }    
                else
                {
			if(archivos[i].listFiles()!=null)
                        {
			    if(!eliminarArchivos(archivos[i].listFiles()))
                            {
                                return false;	
                            }		
                        }    
		    archivos[i].delete();
		    cont++; 
		}
	    }
		if(archivos.length==cont)
                {
                     return true;
                }
			
		
	  return false;
    }
    
    /*------------------------------------------------------------------------------------------*/

    
    
    
    
    
    
    
    
    
    
    
    
    
    /*METODOS PARA CARGAR ARCHIVOS DE SECTOR Y MAQUINAS*/
    
    public ArrayList <Sector> cargarArchivoTextoSector(ArrayList<Sector> arraySector) 
    {
       
       ArrayList<Maquinas> arrayMaquinas;
       
        File raiz = new File("UnLimited GYM\\Sector");
        
        if(raiz.exists() && raiz.list()!=null)
        {
            String[]carpeta = raiz.list();
            
            arraySector = new ArrayList<Sector>();
            
            for(int i=0; i<carpeta.length;i++)
            {
                try(FileReader archivoLectura = new FileReader("UnLimited GYM\\Sector\\"+carpeta[i]+"\\DatosSector"+carpeta[i]+".txt"))
                {
                    BufferedReader Buffer = new BufferedReader(archivoLectura);
                    if(Buffer.ready())
                    {
                        String cadena = Buffer.readLine();
                        if(cadena!=null)
                        {
                            StringTokenizer st = new StringTokenizer(cadena,"|");
                            String Nombre = st.nextToken();
                            int id = Integer.parseInt(st.nextToken());
                            String Tipo = st.nextToken();
                            
                            
                            arraySector.add(new Sector(Nombre,id,Tipo));
                        }
                        Buffer.close();
                        archivoLectura.close();
                    }
                               
                }catch(IOException x)
                {
                    System.out.println("Error E/S "+x);
                }
                
                
                cargarArchivoTextoMaquinas(arraySector.get(i));
            }
            
        }
       return arraySector; 
    }
    
    
    
    
        public void cargarArchivoTextoMaquinas(Sector sector) 
    {
        File raiz = new File("UnLimited GYM\\Maquinas\\"+sector.getId());
        
        if(raiz.exists() && raiz.list()!=null)
        {
            String[]carpeta = raiz.list();
           
            for(int i=0; i<carpeta.length;i++)
            {
                
                try(FileReader archivoLectura = new FileReader("UnLimited GYM\\Maquinas\\"+sector.getId()+"\\"+carpeta[i]+"\\DatosMaquina.txt"))
                {
                    
                    BufferedReader Buffer = new BufferedReader(archivoLectura);
                    if(Buffer.ready())
                    {
                        String cadena = Buffer.readLine();
                        if(cadena!=null)
                        {
                            
                            StringTokenizer st = new StringTokenizer(cadena,"|");
                            int idMaquina = Integer.parseInt(st.nextToken());
                            int idSector = Integer.parseInt(st.nextToken());
                            String Nombre = st.nextToken();
                            int Telefono = Integer.parseInt(st.nextToken());
                            String Marca = st.nextToken();
                            
                            sector.getListaMaquinas().agregarMaquina(new Maquinas(idMaquina,idSector,Nombre,Telefono,Marca));
                            
                        }
                        Buffer.close();
                        archivoLectura.close();
                    }
                            
                }catch(IOException x)
                {
                    System.out.println("Error E/S "+x);
                }
            }
            
        }
    }
    
    
    
    
        
        
        
        
        
        
        
    
        
        
        
        
        
    /*METODOS PARA ACTUALIZAR ARCHIVOS DE SECTOR*/    
        
    public void actualizarTxtSector(Sector sector) throws IOException 
    {							
	File archivoSector;
	FileWriter fEscrit;
	BufferedWriter bEscrit;
	PrintWriter pEscrit;
		
	  archivoSector = new File("UnLimited GYM\\Sector\\"+sector.getId()+"\\DatosSector"+sector.getId()+".txt");
		
	    if(archivoSector.exists() != true)
            {
		crearCarpetaSector(sector);
            }

		fEscrit = new FileWriter(archivoSector);
		bEscrit = new BufferedWriter(fEscrit);
		pEscrit = new PrintWriter(bEscrit);

		pEscrit.println(sector.getNombre()+"|"+sector.getId()+"|"+sector.getTipoEjercicio());
	
		
		
		pEscrit.close();
		bEscrit.close();
    }
    
    

    
    public void crearCarpetaSector(Sector sector)
    {							
	    File carpeta = new File("UnLimited GYM\\Sector\\"+sector.getId());
	    File archivo = new File(carpeta,"DatosSector"+sector.getId()+".txt");
		
		if(!carpeta.exists())
                {
		    carpeta.mkdirs();
		}
		if(!archivo.exists())
                {
		    try
                    {
			archivo.createNewFile();
		    }catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
		}		
    }
    
    
    
    
    
    
    
    
    
    
    
   
    
        /*METODO PARA ELIMINAR CARPETA DE SECTOR Y DE MAQUINAS*/
    
    public boolean eliminarTxtSector(Sector sector)
    {    	
        
        
        if(eliminaCarpetaMaquinas(sector.getId()))
        {
            
	   if(eliminarCarpetaSector(sector))
	   {
               return true;
	   }
        }
      return false;	

    }

    
    public boolean eliminaCarpetaMaquinas(int id)
    {
        File carpeta = new File("UnLimited GYM\\Maquinas\\"+id);
          if(carpeta.exists())
          {
              File[] archivos = carpeta.listFiles();
                if(eliminarArchivos(archivos))
                {
                    if(carpeta.delete())
                    {
                        return true;
                    }
                }
          }
        return false;
    }
    
    
    public boolean eliminarCarpetaMaquinasIDM(int IDMaquina, int IDSector)
    {
        
	File carpeta = new File("UnLimited GYM\\Maquinas\\"+IDSector+"\\"+IDMaquina);
	  if(carpeta.exists())
          {	
              
              
	      File[] archivos = carpeta.listFiles();
		if(eliminarArchivos(archivos))
                {
		   if(carpeta.delete())	
                   {
                       return true;
                   }		     
                }
          }
      return false;
    }

    
    
    public boolean eliminarCarpetaSector(Sector sector)
    {
        
	File carpeta = new File("UnLimited GYM\\Sector\\"+sector.getId());
	  if(carpeta.exists())
          {	
              
	      File[] archivos = carpeta.listFiles();
		if(eliminarArchivos(archivos))
                {
		   if(carpeta.delete())	
                   {
                       return true;
                   }		     
                }
          }
      return false;
    }
    
    
    
    
 

    
    
        
        
    
   /*METODOS PARA ACTUALIZAR ARCHIVOS MAQUINA*/    
    
        public void actualizarTxtMaquinas(Maquinas maquina) throws IOException 
        {							
	File archivoMaquina;
	FileWriter fEscrit;
	BufferedWriter bEscrit;
	PrintWriter pEscrit;
		
	  archivoMaquina = new File("UnLimited GYM\\Maquinas\\"+maquina.getIdSector()+"\\"+maquina.getIdMaquina()+"\\DatosMaquina.txt");
		
	    if(archivoMaquina.exists() != true)
            {
		crearCarpetaMaquina(maquina);
            }

		fEscrit = new FileWriter(archivoMaquina);
		bEscrit = new BufferedWriter(fEscrit);
		pEscrit = new PrintWriter(bEscrit);

		pEscrit.println(maquina.getIdMaquina()+"|"+maquina.getIdSector()+"|"+maquina.getNombre()+"|"+maquina.getTelefonoGarantia()+"|"+maquina.getMarca());
	
		
		
		pEscrit.close();
		bEscrit.close();
         }
    
    

    
    public void crearCarpetaMaquina(Maquinas maquina)
    {							
	    File carpeta = new File("UnLimited GYM\\Maquinas\\"+maquina.getIdSector()+"\\"+maquina.getIdMaquina());
	    File archivo = new File(carpeta,"DatosMaquina.txt");
		
		if(!carpeta.exists())
                {
		    carpeta.mkdirs();
		}
		if(!archivo.exists())
                {
		    try
                    {
			archivo.createNewFile();
		    }catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
		}		
    }
    
}
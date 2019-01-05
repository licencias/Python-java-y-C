package gym;

public class Maquinas 
{
    private int idMaquina;
    private int idSector;
    private String nombre;
    private int telefonoGarantia;
    private String marca;
    
    public Maquinas()
    {
    
    }
    
    public Maquinas(int idMaquina, int idSector, String nombre, int telefonoGarantia, String marca) 
    {
      this.idMaquina = idMaquina;
      this.idSector = idSector;
      this.nombre = nombre;
      this.telefonoGarantia = telefonoGarantia;
      this.marca = marca;
     
    }


    public int getIdMaquina() {
        return idMaquina;
    }

    
    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }


    public int getIdSector() {
        return idSector;
    }


    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getTelefonoGarantia() {
        return telefonoGarantia;
    }


    public void setTelefonoGarantia(int telefonoGarantia) {
        this.telefonoGarantia = telefonoGarantia;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}

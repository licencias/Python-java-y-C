package gym;
   

public class Cliente {
    
   public String Nombre;
   public String Rut;
   private String Contraseña;
   private String Direccion;
   private int Telefono;
   private String Plan;

   
   public Cliente()
   {   
   }
   
    public Cliente(String Nombre, String Rut, String Contraseña, String Direccion, int Telefono, String Plan) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.Contraseña = Contraseña;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Plan = Plan;
    }

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public String getRut() {
        return Rut;
    }


    public void setRut(String Rut) {
        this.Rut = Rut;
    }


    public String getContraseña() {
        return Contraseña;
    }


    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    public int getTelefono() {
        return Telefono;
    }


    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }


    public String getPlan() {
        return Plan;
    }


    public void setPlan(String Plan) {
        this.Plan = Plan;
    }
    
   
}

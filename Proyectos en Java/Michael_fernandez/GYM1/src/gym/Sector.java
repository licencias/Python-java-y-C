
package gym;

public class Sector {
    private String Nombre;
    private int id;
    private String tipoEjercicio;
    private ListaMaquinas listaMaquinas;
    
    public Sector(String Nombre, int id, String tipoEjercicio) {
        this.Nombre = Nombre;
        this.id = id;
        this.tipoEjercicio = tipoEjercicio;
        listaMaquinas = new ListaMaquinas();
        
    }
    

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTipoEjercicio() {
        return tipoEjercicio;
    }


    public void setTipoEjercicio(String tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }


    public ListaMaquinas getListaMaquinas() {
        return listaMaquinas;
    }

    public void setListaMaquinas(ListaMaquinas listaMaquinas) {
        this.listaMaquinas = listaMaquinas;
    }

    
}

package src.peliculas;

public class Pelicula {
    private int id;
    private String nombre;
    private int año;
    private String categoria;
    private boolean disponible;

    public Pelicula(int id, String nombre, int año, String categoria, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.categoria = categoria;
        this.disponible = disponible;
    }

    public Pelicula() {
    }

    //Inicio Set and Get pelicula

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //fin Set and Get Pelicula

    public String getInformacion() {
        String resultado = "Id: "+id+" Nombre de la pelicula: "+nombre+" Año: "+año+" Categoria: "+categoria+" Disponible: "+disponible;
        return resultado;
    }

}
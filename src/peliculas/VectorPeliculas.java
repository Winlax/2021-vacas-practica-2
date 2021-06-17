package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {

    private Pelicula[] peliculas = new Pelicula[50];
    private int siguienteCodigo;

    public VectorPeliculas() {
        siguienteCodigo = 1;
    }

    //Agregar Peliculas
    public void agregarPeliculas(String nombre, int año, String categoria, boolean disponible) {
        if (siguienteCodigo > 50) {
            System.out.println("Límite de clientes alcanzado");
        } else {
            peliculas[(siguienteCodigo - 1)] = new Pelicula(siguienteCodigo, nombre, año, categoria, disponible);
        }
        siguienteCodigo++;
    }

    public void agregarPeliculas() {
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int año = IngresoDatos.getEntero("Ingrese el año de la pelicula", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula");
        agregarPeliculas(nombre, año, categoria, true);
    }

    //Fin agregar Peliculas
    public void mostrarPeliculas() {
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigo - 1); i++) {
            System.out.println("-" + i + ") " + peliculas[i].getInformacion());
        }
        System.out.println("\n\n");
    }
    
    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }

}



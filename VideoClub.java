import java.util.ArrayList;

public class VideoClub {
    private String nombre;
    private String catalogo;
    private ArrayList<Pelicula> peliculas;

    public VideoClub(){
        this.nombre = "";
        this.catalogo = "";
        peliculas = new ArrayList<Pelicula>();
    }

    public VideoClub(String nombre, String catalogo){
        this.nombre = nombre;
        this.catalogo = catalogo;
    }

    public String getnombre(){
        return this.nombre;
    }

    public String getcatalogo(){
        return this.catalogo;
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public ArrayList<Actor> obtenerActoresDePelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.gettitulo().equals(titulo)) {
                return pelicula.getActores();
            }
        }
        return null;
    }

    public Pelicula obtenerPeliculaConMasActores() {
        Pelicula peliculaConMasActores = null;
        int maxActores = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getNumeroDeActores() > maxActores) {
                maxActores = pelicula.getNumeroDeActores();
                peliculaConMasActores = pelicula;
            }
        }
        return peliculaConMasActores;
    }
    public Pelicula buscarPelicula(String titulo){
        for(Pelicula pelicula : peliculas){
            if(pelicula.gettitulo().equalsIgnoreCase(titulo)){
                return pelicula;
            }
        }
        return null;
    }

}

import java.util.ArrayList;

public class Pelicula {
    private String codigo;
    private String titulo;
    private String productora;
    private int año;
    private ArrayList<Actor> actores;

    public Pelicula(String codigo, String titulo, String productora, int año){
        this.codigo = "";
        this.titulo = "";
        this.productora = "";
        this.año = 0;
        actores = new ArrayList<Actor>();
    }

    public String getcodigo(){
        return this.codigo;
    }

    public String gettitulo(){
        return this.titulo;
    }

    public String getproductora(){
        return this.productora;
    }

    public int getaño(){
        return this.año;
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public int getNumeroDeActores() {
        return actores.size();
    }
}

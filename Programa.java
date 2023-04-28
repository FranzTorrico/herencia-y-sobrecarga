import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        VideoClub videoClub = new VideoClub();
        Pelicula pelicula1 = new Pelicula("12", "El hombre araña", "Marvel", 2000);
        Pelicula pelicula2 = new Pelicula("10", "Sherk", "Dreanworks", 2001);
        videoClub.agregarPelicula(pelicula1);
        videoClub.agregarPelicula(pelicula2);
        Actor actor1 = new Actor("Carlos", "Mamani", "02/03/1999", "Boliviano");
        Actor actor2 = new Actor("Juan", "Perez", "10/06/1900", "Peruano");
        Actor actor3 = new Actor("Benito", "Marca", "27/0572001", "Holandez");
        pelicula1.agregarActor(actor1);
        pelicula2.agregarActor(actor2);
        pelicula2.agregarActor(actor3);
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Ingrese el titulo de la pelicula");
        String titulo = scanner.nextLine();
        Pelicula peliculabuscada = videoClub.buscarPelicula(titulo);
        if(peliculabuscada != null){
            System.out.println("actores de la pelicula:"+ peliculabuscada.gettitulo()+":");
            for(Actor actor : peliculabuscada.getActores()){
                System.out.println(actor.getnombre()+""+actor.getapellido());
            }
        }else{
            System.out.println("no se encontro la pelicula");
        }
        
        
       
        
        Pelicula peliculaConMasActores = videoClub.obtenerPeliculaConMasActores();
        System.out.println("La pelicula con mas actores es:"+peliculaConMasActores.gettitulo());
    }

}

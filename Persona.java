import java.lang.*;
public class Persona{
    protected String nombre;
    protected String apellido;
    protected String fecha_nacimiento;

    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.fecha_nacimiento = "";

    }

    public Persona(String nombre, String apellido, String fecha_nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getnombre(){
        return this.nombre;
    }

    public String getapellido(){
        return this.apellido;
    }

    public String getfecha_nacimiento(){
        return this.fecha_nacimiento;
    }
    
}

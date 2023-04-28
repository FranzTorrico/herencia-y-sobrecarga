public class Actor extends Persona {
    private String nacionalidad;

    public Actor(){
        this.nacionalidad = "";
    }
    
    public Actor (String nombre, String apellido, String fecha_nacimiento, String nacionalidad){
        super(nombre, apellido, fecha_nacimiento);
        this.nacionalidad = nacionalidad;
    }

    public String getnacionalidad(){
        return this.nacionalidad;
    }

}

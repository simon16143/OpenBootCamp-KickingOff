public class Practice {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(23);
        persona.setNombre("Symon");
        persona.setTelefono("613975184");
        System.out.println("Hi OpenBootCamp, I'm "+ persona.getNombre() + ", I'm " + persona.getEdad() + "and my phone number is " + persona.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;


    //Defining setters
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    //Defining getters
    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
}

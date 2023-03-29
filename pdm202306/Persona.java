
package pdm202306;

import java.time.LocalDate;



public class Persona {
    String nombre;
    String apellidos;
    int ci;
    int edad;
    
       
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int ci, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarDatosCompletos(){
        System.out.println("El nombres es: "
                +nombre+ "Apellidos: "+apellidos
                +"carnet: "+ci+" Edad: "+edad);
    }
    
    public int nacimiento(){
        int year = LocalDate.now().getYear();
        return year - this.edad;
    }
    
    
}


package pdmpoo20231;

public class Persona {
    
    //atributos
    String nombre;
    String apellido;
    int edad;
    int ci;

    public Persona(String nombre,String apellido,int edad,int ci){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    
    }
    
    //acciones que realiza la clase
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public void obtenerDatos(){
        System.out.println("La persona tiene los siguientes datos. Nombre:"
                +nombre+" Apellido: "+apellido+" Carnet: "+ci+" Edad: "
                +edad);
    }
    
    
    

    
    
    
    
    
    
    
}

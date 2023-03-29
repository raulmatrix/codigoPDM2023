
package pdm202306;

public class PDM202306 {

    public static void main(String[] args) {
       
        Persona maria = new Persona("Maria", "Zubieta", 5658962, 25);
        maria.mostrarDatosCompletos();
        
        //herencia
        
        Estudiante jose = new Estudiante("SIS-001", "Sistemas Informaticos", "Jose", "Peredo Herbas", 4589632, 26);
        jose.mostrarDatosCompletos();
        
        
        System.out.println("El año de nacimiento es: "+jose.nacimiento());
    }
    
}


package pdmpoo20231;

public class PDMPOO20231 {

    
    public static void main(String[] args) {
        
        //instanciando objetos
        
        Persona jose = new Persona("Jose", "Gomez Bolaños", 25, 4568962);
        
        System.out.println(jose.getEdad());
        
        jose.obtenerDatos();
        
        jose.setEdad(24);
        jose.obtenerDatos();
        
        /****************/
        
        Estudiante alicia = new Estudiante("SIS-001", "Sistemas Informaticos", "Alicia", "Perez", 20, 5687562);
        alicia.obtenerDatos();
    }
    
}

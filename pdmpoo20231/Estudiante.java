
package pdmpoo20231;

public class Estudiante extends Persona{
    //atributos
    String codEst;
    String carrera;

    public Estudiante(String codEst, String carrera, String nombre, String apellido, int edad, int ci) {
        super(nombre, apellido, edad, ci);
        this.codEst = codEst;
        this.carrera = carrera;
    }

    public String getCodEst() {
        return codEst;
    }

    public void setCodEst(String codEst) {
        this.codEst = codEst;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
}

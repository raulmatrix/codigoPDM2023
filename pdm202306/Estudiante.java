
package pdm202306;

public class Estudiante extends Persona{
    String codEst;
    String carrera;

    public Estudiante(String codEst, String carrera, String nombre, String apellidos, int ci, int edad) {
        super(nombre, apellidos, ci, edad);
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


package pdm202308;


public class Contador extends Empleado{
    String matricula;
    Double pagoHoraExtra;

    public Contador(String matricula, Double pagoHoraExtra, String nombre, String apellidos, String areaEmpresa, int nroCarnet, Double pagoHora, int cantHoras, int cantAnios) {
        super(nombre, apellidos, areaEmpresa, nroCarnet, pagoHora, cantHoras, cantAnios);
        this.matricula = matricula;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(Double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }
    
    @Override
    public void calcularSueldo(){
        Double sueldo = (pagoHora*cantHoras)+getAntiguedad()+pagoHoraExtra;
        System.out.println("EL sueldo del contador es: "
                +sueldo);
    }
}

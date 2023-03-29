
package pdm202307;


public class Triangulo extends Figura{
    int base,altura;

    public Triangulo(int base, int altura, int x, int y, String nombre) {
        super(x, y, nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del triangulo es: "
                +((base*altura)/2));
    
    }

   
    
    
}

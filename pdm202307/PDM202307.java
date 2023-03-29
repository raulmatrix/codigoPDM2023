
package pdm202307;

public class PDM202307 {
   
    public static void main(String[] args) {
       
        Figura fig1 = new Figura(5, 6, "Circulo");
        fig1.calcularArea();
        
        /*************/
        
        Triangulo t1 = new Triangulo(10, 15, 10, 10, "Triangulo");
        t1.calcularArea();
        
        /****************/
        Rectangulo r1 = new Rectangulo(10, 20, 14, 13, "Rectangulo");
        r1.calcularArea();
        
        
        
    }
    
}

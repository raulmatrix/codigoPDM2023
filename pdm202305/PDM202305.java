
package pdm202305;


public class PDM202305 {
    
    static double pi = 3.1416;

    public static void main(String[] args) {
        
        String tipoFigura = "circulo";
        
        if(tipoFigura=="circulo"){
            areaCirculo(5);
        }else if(tipoFigura=="rectangulo"){
            areaRectangulo(6, 7);
        }else if(tipoFigura=="triangulo"){
            areaTriangulo(7, 8);
        }
        
        
    }
    
    public static void areaCirculo(int radio){
        System.out.println("El area del circulo es: "+
                pi*(radio * radio));
    
    }
    
    public static void areaRectangulo(int base, int altura){
        System.out.println("El area del rectangulo es: "+
                (base*altura));
    }
    
    public static void areaTriangulo(int base, int altura){
        System.out.println("El area del triangulo es: "
                +((base*altura)/2));
    }
    
}

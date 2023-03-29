
package pdm20233;

public class PDM20233 {

    public static void main(String[] args) {
        
        /*int [] numeros = new int[10];
        String meses[]={"enero","febrero","marzo","abril","mayo","diciembre"};
        
        System.out.println(meses[1]);
        
        for(int i=0;i<meses.length;i++){
            System.out.println("La posicion "+i+" con valor: "
                    +meses[i]);
        }*/
        
        
        int numeros [] = {5,2,4,1,10,12};
        int mayor = 0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        System.out.println(mayor);   
        
    }
    
    
}


package exemploarraw1;


public class ExemploArraw1 {

        
    
    float[]temperaturas=new float[7];
    public void traballarArray(){
    
        
        Metodos metodos1=new Metodos();
        metodos1.visualizar(temperaturas);
        metodos1.crearArray(temperaturas);
        metodos1.visualizar(temperaturas);
        float[]resposta=metodos1.duplicar(temperaturas);
        metodos1.visualizar(resposta);
    }
      public static void main(String[] args) {
          ExemploArraw1 aux=new ExemploArraw1();
        aux.traballarArray();
        
    }
    
}


package fibonacci;


public class Factorial {
    /*operaciones para obtener el factorial
    @param: tenumero
    */
    public int operacion(int tenumero){
        int result=1;
      // operaciones para numero factorial
    while(tenumero != 0){
      
        result=result*tenumero;
        tenumero=tenumero-1;
  
    }
    return result;    
     /*
    @return: result
    */
        
        
    }
    
}

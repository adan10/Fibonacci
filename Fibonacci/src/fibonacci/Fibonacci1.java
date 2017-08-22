
package fibonacci;

public class Fibonacci1 {
    /*
    @param:tenumero
    */
  public String operacion(int tenumero){
        int antpval=0, preval=1;
String serie="";			
		//operaciones para serie Fibonacci
                for(int aux=tenumero; aux!=0; aux--){
                    int result;
                result=preval+antpval;
                        serie=serie+result+" - ";
			
			preval=antpval;
			antpval=result;
                
                }
                return serie;
                /*
                @return:serie
                */
    }
    
  
   
}


package des;

/**
 * Clase para aplicar XOR entre dos binarios 
 * @author Carlos Nevarez
 */
public class XOR {
    
    private String resultado = null;
    /**
     * Metodo que aplica XOR entre dos cadenas de binario, cualquier longitud
     *
     * @author Carlos Nevarez
     * @param uno Cadena cualquiera de binario
     * @param dos Cadena cualquiera de bianrio
     * @return 
     * @see 
     */
    public String xor(String uno, String dos){
        char[] one = uno.toCharArray();
        char[] two = dos.toCharArray();
        
        for(int i=0; i<one.length; i++){
            if(one[i]==two[i])
            {
                resultado += 0;
            }
            else if(one[i]!=two[i])
            {
                resultado += 1;
            }
        }
        
        return resultado;
    }
}

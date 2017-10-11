package des;

/**
 * Aplicacion para hacer el cifrado DES
 * @author Carlos Nevarez
 */
public class DES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Llaves l = new Llaves();
        ConverHex C = new ConverHex();
        
        String lmao = C.pasar_Bin("133457799BBCDFF1");
        System.out.println(lmao);
        l.Llaves(lmao);
    }
    
}

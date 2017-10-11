package des;

import java.util.Scanner;

/**
 * Clase que se ocupa para capturar datos
 * @author Carlos Nevarez
 */
public class Captura {
    private Scanner sc = new Scanner(System.in); ;
    private String entrada;
    private String salida;
    
    public String Recibe_clave(){
        //Recibe clave
        System.out.println("Ingresa la clave de cifrado");
        entrada = sc.next();
        //salida = v.validar16caracteres(ent, ent.length());
        return entrada;
    }
    
    public String Recibe_dato(){
        //Recibe dato
        
        
        return "";
    }
            
}

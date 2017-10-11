package des;

/**
 * Clase que se usa para generar las 16 llaves
 * @author Carlos 
 */
public class Llaves {
    /*INICIALIZACION DE VARIABLES*/
    private final Permutar p = new Permutar(); //Objeto para aplicar permutaciones
    private String[] llaves = new String[16]; //Arreglo de llaves
    private String sub_llave = ""; //Acumulador para procesos intermedios
    //Para la division de K's
    private String parte_Izq = "";
    private String parte_Der = "";
    
    //Arreglos de posicion
    private final int[] unoIzq = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 0};
    private final int[] dosIzq = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
            21, 22, 23, 24, 25, 26, 27, 0, 1};
    
    
    /*METODOS*/
    /**
     * Metodo para generar las 16 llaves
     *
     * @author Carlos Nevarez
     * @param clave La clave en binario que se va a usar para el cifrado
     * @return Arreglo de llaves
     */
    public String[] Llaves(String clave) {
        char[] bits;
        
        //Permutacion PC1
        sub_llave = p.PC1(clave);
        
        //Se pone el resultado de la permutacion en char's
        bits = sub_llave.toCharArray();
       
        //Se parte en dos para trabajar con cada lado
        Partir(bits);
        
        //Se rota y se hace la permutacion PC-2
        for(int i=0; i<llaves.length; i++) {
            //Rotacion
            sub_llave = rotar(i);
            
            //Permutacion PC-2
            llaves[i] = p.PC2(sub_llave);
        }
        
        /*DESPLEGAR LLAVES
        char[] despliegue;
        String sub;
        for (int x = 0; x < 16; x++) {
            sub = "";
            despliegue = llaves[x].toCharArray();
            for (int j=0; j<llaves[x].length(); j++) {
                if ((1+j)%4 == 0) {
                    sub += despliegue[j] + " ";
                } else {
                    sub += despliegue[j];
                }
            }
            System.out.println("Llave " + (x + 1) + ": " + sub);
        }
        */
        
        return llaves;
    }
    
    /**
     * Metodo que aplica la rotacion de cada lado en la generacion de llaves
     *
     * @author Carlos Nevarez
     * @param n Indica en que ronda de llaves va
     * @return K(m) klista para permutar
     * @see Llaves
     */
    private String rotar(int n){
        //Se divide las partes par manipularlas en un for
        char[] rotacionIzq = parte_Izq.toCharArray();
        char[] rotacionDer = parte_Der.toCharArray();
        
        //Se reinician las pasrtes para llenarlas en un for
        parte_Izq = "";
        parte_Der = "";
        
        //Se recorren los bits de los lados
        for(int i=0; i<28; i++) {
            if((n==0) || (n==1) || (n==8) || (n==15)) {
                //Casoa espeaiales de recorrimiento
                parte_Izq += rotacionIzq[unoIzq[i]];
                parte_Der += rotacionDer[unoIzq[i]];
            }
            else {
                //Caso general de recorrimiento
                parte_Izq += rotacionIzq[dosIzq[i]];
                parte_Der += rotacionDer[dosIzq[i]];
            }    
        }
        
        //Se devuelve todo el pedazo de 56 bits
        return parte_Izq+parte_Der;
    }
    
    
    /**
     * Metodo que parte en dos la clave ara manejar cada lado
     *
     * @author Carlos Nevarez
     * @param bits arreglo que trae toda la llave
     */
    private void Partir(char[] bits){
        for(int i=0; i<56; i++)
        {
            if(i < 28) {
                parte_Izq += bits[i];
            }
            else {
                parte_Der += bits[i];
            }
        }
        
    }
    
}

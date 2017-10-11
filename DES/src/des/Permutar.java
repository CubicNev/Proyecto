package des;

/**
 * Clase que contiene todas las permutaciones del cifrado DES
 *
 * @author Carlos Nevarez
 */
public class Permutar {

    //Inicializacion de variables
    //Arreglo de char's para acumular permutacion
    private char[] per;

    //Permutacion PC1
    final private int[] PC1 = {55, 48, 40, 32, 24, 16, 8, 0,
        57, 49, 41, 33, 25, 17, 9, 1,
        58, 50, 42, 34, 26, 18, 10, 2,
        59, 51, 43, 35, 62, 54, 46, 38,
        30, 22, 14, 6, 61, 53, 45, 37,
        29, 21, 13, 5, 60, 52, 44, 36,
        28, 20, 12, 4, 27, 19, 11, 3};

    //Permutacion PC2
    final private int[] PC2 = {13, 16, 10, 23, 0, 4, 2, 27,
        14, 5, 20, 9, 22, 18, 11, 3,
        25, 7, 15, 6, 26, 19, 12, 1,
        40, 51, 30, 36, 46, 54, 29, 39,
        50, 44, 32, 47, 43, 48, 38, 55,
        33, 52, 45, 41, 49, 35, 28, 31};

    //Permutacion Inical
    final private int[] IP = {57, 49, 41, 33, 25, 17, 9, 1,
                        59, 51, 43, 35, 27, 19, 11, 3,
                        61, 53, 45, 37, 29, 21, 13, 5,
                        63, 55, 47, 39, 31, 23, 15, 7,
                        56, 48, 40, 32, 24, 16, 8, 0,
                        58, 50, 42, 34, 26, 18, 10, 2,
                        60, 52, 44, 36, 28, 20, 12, 4,
                        62, 54, 46, 38, 30, 22, 14, 6};
    
    //Expansion de R()
    final private int[] E = {32, 1, 2, 3, 4, 5, 4, 5,
                            6, 7, 8, 9, 8 ,9 ,10, 11,
                            12, 13, 12, 13, 14, 15, 16, 17,
                            16, 17, 18, 19, 20, 21, 20, 21,
                            22, 23, 24, 25, 24, 25, 26, 27,
                            28, 29, 28, 29, 30, 31, 32, 1};
            
    //Permuacion P de los bloques
    final private int[] P = {16, 7, 20, 21, 29, 12, 28, 17,
                            1, 15, 23, 26, 5, 18, 31, 10,
                            2, 8, 24, 14, 32, 27, 3, 9,
                            19, 13, 30, 6, 22, 11, 4, 25};
    
    //Permutacion final de la clave
    final private int[] FP = {40, 8, 48, 16, 56, 24, 64, 32,
                            39, 7, 47, 15, 55, 23, 63, 31,
                            38, 6, 46, 14, 54, 22, 62, 30,
                            37, 5, 45, 13, 53, 21, 61, 29,
                            36, 4, 44, 12, 52, 20, 60, 28,
                            35, 3, 43, 11, 51, 19, 59, 27,
                            34, 2, 42, 10, 50, 18, 58, 26,
                            33, 1, 41, 9, 49, 17, 57, 25};
    
    /**
     * Metodo que permuta la clave principal (pasa de 64 a 56 bits)
     *
     * @author Carlos Nevarez
     * @param dato Clave en binario
     * @return Clave en binario permutada
     * @see Llaves
     */
    public String PC1(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i<56; i++) {
            dato += per[PC1[i]];
        }
        return dato;
    }

    /**
     * Metodo que aplica la segunda permutacion para sacar las 16 subclaves
     *
     * @author Carlos Nevarez
     * @param dato Cualquier K del cifrado (K1 a K16)
     * @return De K1 a K2 permutada con la tabla PC2
     * @see Llaves
     */
    public String PC2(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i<48; i++) {
            dato += per[PC2[i]];
        }
        return dato;
    }

    /**
     * Metodo que aplica la tabla IP
     *
     * @author Carlos Nevarez
     * @param dato Dato en binario
     * @return Permutacion del Dato
     * @see 
     */
    public String IP(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i < per.length; i++) {
            dato += per[IP[i]];
        }
        return dato;
    }
    
    /**
     * Metodo que aplica la expansion de R()
     *
     * @author Carlos Nevarez
     * @param dato Lado izquierdo
     * @return Expansion de R()
     * @see 
     */
    public String E(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i<48; i++) {
            dato += per[E[i]];
        }
        return dato;
    }
    
    /**
     * Metodo que aplica la pérmutacion aplicada despues de sacar los bloques de S()
     *
     * @author Carlos Nevarez
     * @param dato Union de S()'s
     * @return Permutacion para aplicarle un XOR con L()
     * @see 
     */
    public String P(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i<32; i++) {
            dato += per[P[i]];
        }
        return dato;
    }
    
    /**
     * Metodo que aplica la permutacion final al dato resultante de las 16 vueltas
     *
     * @author Carlos Nevarez
     * @param dato Dato de 64 ya procesado
     * @return Daro cifrado 
     * @see 
     */
    public String FP(String dato) {
        per = dato.toCharArray();
        dato = "";
        for (int i = 0; i<64; i++) {
            dato += per[FP[i]];
        }
        return dato;
    }
}

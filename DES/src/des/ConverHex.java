package des;

/**
 * Clase que pasa a binario a partir del decimal (y viceversa), cualquier
 * entrada de 1 a F/f
 *
 * @author Carlos Nevarez
 */
public class ConverHex {

    public String pasar_Bin(String dato) {
        
        char[] pasar = dato.toCharArray();
        dato = "";
            
        for (int i = 0; i < pasar.length; i++) {
            if (pasar[i] == '0') {
                dato += "0000";
            } else if (pasar[i] == '1') {
                dato += "0001";
            } else if (pasar[i] == '2') {
                dato += "0010";
            } else if (pasar[i] == '3') {
                dato += "0011";
            } else if (pasar[i] == '4') {
                dato += "0100";
            } else if (pasar[i] == '5') {
                dato += "0101";
            } else if (pasar[i] == '6') {
                dato += "0110";
            } else if (pasar[i] == '7') {
                dato += "0111";
            } else if (pasar[i] == '8') {
                dato += "1000";
            } else if (pasar[i] == '9') {
                dato += "1001";
            } else if (pasar[i] == 'a' || pasar[i] == 'A') {
                dato += "1010";
            } else if (pasar[i] == 'b' || pasar[i] == 'B') {
                dato += "1011";
            } else if (pasar[i] == 'c' || pasar[i] == 'C') {
                dato += "1100";
            } else if (pasar[i] == 'd' || pasar[i] == 'D') {
                dato += "1101";
            } else if (pasar[i] == 'e' || pasar[i] == 'E') {
                dato += "1110";
            } else if (pasar[i] == 'f' || pasar[i] == 'F') {
                dato += "1111";
            } else {
                dato += "0000";
            }

        }

        return dato;
    }
    
    public String pasar_Hex(String dato) {
        
        char[] pasar = dato.toCharArray();
        dato = null;
            
        for (int i = 0; i < pasar.length; i++) {
            if (pasar[i] == '0') {
                dato += "0000";
            } else if (pasar[i] == '1') {
                dato += "0001";
            } else if (pasar[i] == '2') {
                dato += "0010";
            } else if (pasar[i] == '3') {
                dato += "0011";
            } else if (pasar[i] == '4') {
                dato += "0100";
            } else if (pasar[i] == '5') {
                dato += "0101";
            } else if (pasar[i] == '6') {
                dato += "0110";
            } else if (pasar[i] == '7') {
                dato += "0111";
            } else if (pasar[i] == '8') {
                dato += "1000";
            } else if (pasar[i] == '9') {
                dato += "1001";
            } else if (pasar[i] == 'a' || pasar[i] == 'A') {
                dato += "1010";
            } else if (pasar[i] == 'b' || pasar[i] == 'B') {
                dato += "1011";
            } else if (pasar[i] == 'c' || pasar[i] == 'C') {
                dato += "1100";
            } else if (pasar[i] == 'd' || pasar[i] == 'D') {
                dato += "1101";
            } else if (pasar[i] == 'e' || pasar[i] == 'E') {
                dato += "1110";
            } else if (pasar[i] == 'f' || pasar[i] == 'F') {
                dato += "1111";
            } else {
                dato += "0000";
            }

        }

        return dato;
    }
}

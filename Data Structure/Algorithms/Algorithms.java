import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithms {  
    public static void main(String[] args) {


        String s = "abcbabcakxbc";
        System.out.println(uniqueString(s));
    }
    
    /*
     * Voce transforma a string em um array -> string.toCharArray()
     * Adiciona cada char dela em uma HashMap {key: c, value: pega value de "c" + 1}
     * Segundo <for> itera pela String de novo e pega o char que está iterando 
     *      de dentro do HashMap e vê se o valor dele é 1 já retorna.
     * Se nenum bater com essa checagem, retorna "_" mesmo.
     */
    public static String uniqueString(String string) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (char letra : string.toCharArray()) {
            map.put(letra, map.getOrDefault(letra, 0) + 1);
        }

        for (char c : string.toCharArray()) {
            if (map.get(c) == 1) {
                return String.valueOf(c); 
            }
        }


        return "_";
    }
}
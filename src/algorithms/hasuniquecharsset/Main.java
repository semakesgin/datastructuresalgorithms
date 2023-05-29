package algorithms.hasuniquecharsset;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }

    public static boolean hasUniqueChars(String string) {
        char[] chars =string.toCharArray();
        Set<Character> charsSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++){
            charsSet.add(chars[i]);}
        if(chars.length != charsSet.size()){
            return false;
        }
        return true;

    }

}

package algorithms.groupanagrams;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        Map<String,List> anagrams = new HashMap<>();
        List<List<String>> strList = new ArrayList<>();
        for(String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sirali = new String(chars);
            if(anagrams.get(sirali) != null){
                 ArrayList<String> values=new ArrayList<>( anagrams.get(sirali));
                values.add(str);
                anagrams.put(sirali,values);
            }else{
                anagrams.put(sirali,Arrays.asList(str));
            }


            }
        for (Map.Entry<String,List> entry : anagrams.entrySet()) {
            strList.add(entry.getValue());
        }
        return strList;
    }
}
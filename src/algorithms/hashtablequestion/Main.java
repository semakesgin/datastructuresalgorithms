package algorithms.hashtablequestion;

import java.util.HashMap;

public class Main
{
/*
* Bu method nested for olduğu için Bigo O(n^2) olur*/
    public static boolean itemInCommon(int[] array1,int[] array2){
        for (int i:array1){
            for(int j : array2){
                if (i == j)
                    return true;
            }
        }
        return false;
    }
/*
* Bu methodda ayrı ayrı for loop olduğu için big o O(n) olur daha verimli
* */
    public static boolean itemInCommonWithHashMap(int[] array1,int[] array2){
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();
        for (int i:array1){
            myHashMap.put(i,true);
        }
        for (int j : array2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int array1[]={1,3,5};
        int array2[]={2,4,5};

        System.out.println(itemInCommonWithHashMap(array1,array2));

    }
}

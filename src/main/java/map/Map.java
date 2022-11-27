package map;

import java.util.Arrays;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String[]> ogrMap = new HashMap<>();
        ogrMap.put(101,new String[]{"adı1","soyadı1","branşı"});
        ogrMap.put(102,new String[]{"adı2","soyadı2","branşı2"});
        ogrMap.put(103,new String[]{"adı3","soyadı3","branşı3"});
        ogrMap.put(102,new String[]{"ali","veli","dev"});

        System.out.println("ogrMap.get(101) = " + Arrays.toString( ogrMap.get(101)));

        for (String w: ogrMap.get(102)){
            System.out.println(w);

        }


    }
}

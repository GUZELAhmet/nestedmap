import java.util.HashMap;
import java.util.Map;

public class OgrenciBilgiMap {

  public  Map<Integer,Ogrenci> ogrBilgimap = new HashMap<>();


    @Override
    public String toString() {
        return "OgrenciBilgiMap{" +
                "ogrBilgimap=" + ogrBilgimap +
                '}';
    }

    public static void main(String[] args) {
        Map<Integer,Ogrenci> ogrBilgimap = new HashMap<>();



        Ogrenci ogrx=new Ogrenci("Ali","şen","dev");
        ogrBilgimap.put(101,ogrx);
    }

}

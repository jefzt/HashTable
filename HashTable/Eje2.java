import java.util.Hashtable;

public class Eje2 {
      public static void main(String[] args) {
        Hashtable<Integer, String> datos = new Hashtable<>();
        datos.put(1, "A");
        datos.put(2, "B");
        for (Integer k : datos.keySet()) {
            System.out.println(datos.get(k));
        }
    }
}

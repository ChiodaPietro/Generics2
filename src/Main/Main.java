package Main;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UnorderedCouple<String, String> i= new UnorderedCouple<String, String>(new String("sosoos"), new String ("february is close"));
        System.out.println(i.getFirst());
        ArrayList<Object> ls= new ArrayList<Object>();
        ls.add(new Integer(23423));
        ls.add("String");
        ls.add(23.23);
        ls.remove("String");
        //vi har set, get ,remove, add, indexOf,.....
        System.out.println(ls.get(1));
        System.out.println(i.getSecond());
        System.out.println(i.CheckEquality());
    }
}

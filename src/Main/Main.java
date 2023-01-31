package Main;

public class Main {
    public static void main(String[] args) {
        UnorderedCouple<Object> i= new UnorderedCouple<Object>(new String("sosoos"), new String ("february is close"));
        System.out.println(i.getFirst());
        System.out.println(i.getSecond());
        System.out.println(i.CheckEquality());
    }
}

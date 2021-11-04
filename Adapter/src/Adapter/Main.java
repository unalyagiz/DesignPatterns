package Adapter;

/**
 * @author Yağız Ünal on 11/4/21.
 * @project DesignPatterns.Adapter
 **/
public class Main {
    public static void main(String[] args) {
        Charger ukCharger = new UkSocketCharger();
        Charger euCharger = new EuSocketCharger();

        SocketAdapter ukSocketAdapter = new UkToEuSocketAdapter(ukCharger);
        System.out.println(ukSocketAdapter.useAdapter());
        SocketAdapter euSocketAdapter = new EuToUkSocketAdapter(euCharger);
        System.out.println(euSocketAdapter.useAdapter()+"\n");

        //using incompatible adapter
        SocketAdapter wrongAdapter = new UkToEuSocketAdapter(euCharger);
        System.out.println(wrongAdapter.useAdapter());
        SocketAdapter wrongAdapter2 = new EuToUkSocketAdapter(ukCharger);
        System.out.println(wrongAdapter2.useAdapter());

    }
}

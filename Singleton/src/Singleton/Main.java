package Singleton;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.Singleton
 **/
public class Main {
    public static void main(String[] args) {
        DBManager.getDB().openConnection("localhost","yagiz","1234");
        DBManager.getDB().executeQuery("SELECT * FROM products");
        DBManager.getDB().executeQuery("DROP TABLE products");
    }
}

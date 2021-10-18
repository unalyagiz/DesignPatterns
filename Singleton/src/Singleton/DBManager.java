package Singleton;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.Singleton
 **/
public class DBManager {

    private static DBManager dbManager = new DBManager();

    private DBManager(){}

    public static DBManager getDB(){
        return dbManager;
    }
    public void openConnection(String host,String user,String password){
        System.out.println(dbManager);
        System.out.println("Database connection has been established with credentials-> HOST: "+host+" User:"+user);
    }
    public void executeQuery(String query){
        System.out.println(dbManager);
        System.out.println("Executing query \""+query+"\"");
    }

}

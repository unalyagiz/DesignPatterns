package AbstractFactory;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.AbstractFactory
 **/
public class FactoryProducer {
    public static CarFactory getFactory(String brand){
        if(brand.equalsIgnoreCase("MERCEDES"))
            return new MercedesFactory();
        else if(brand.equalsIgnoreCase("BMW"))
            return new BmwFactory();
        else
            return null;
    }
}


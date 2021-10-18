package Factory;

/**
 * @author Yağız Ünal on 10/19/21.
 * @project DesignPatterns.Factory
 **/
public class CarFactory {
    public Car createCar(String brand,String model,String year){
        if(brand.equalsIgnoreCase("mercedes"))
            return new Mercedes(model,year);
        else if(brand.equalsIgnoreCase("bmw"))
            return new Bmw(model,year);
        else
            return null;
    }
}

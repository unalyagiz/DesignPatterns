package AbstractFactory;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.AbstractFactory
 **/
public abstract class CarFactory {
    abstract Car createCar(String model, String year);
}

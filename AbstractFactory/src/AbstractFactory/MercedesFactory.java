package AbstractFactory;

import AbstractFactory.model.Mercedes;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.AbstractFactory
 **/
public class MercedesFactory extends CarFactory{

    @Override
    Car createCar(String model, String year) {
        return new Mercedes(model,year);
    }
}

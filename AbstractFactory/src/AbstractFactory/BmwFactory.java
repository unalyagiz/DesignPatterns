package AbstractFactory;

import AbstractFactory.model.Bmw;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.AbstractFactory
 **/
public class BmwFactory extends CarFactory{
    @Override
    Car createCar(String model, String year) {
        return new Bmw(model,year);
    }
}

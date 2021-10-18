package AbstractFactory;

import AbstractFactory.model.Mercedes;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.AbstractFactory
 **/
public class Main {
    public static void main(String[] args) {
        CarFactory mercedesFactory = FactoryProducer.getFactory("mercedes");
        Car mercedes = mercedesFactory.createCar("C180 AMG", "2021");
        mercedes.drive();

        CarFactory bmwFactory = FactoryProducer.getFactory("Bmw");
        Car bmw = bmwFactory.createCar("320i", "2020");
        bmw.drive();
    }
}

package Adapter;

/**
 * @author Yağız Ünal on 11/4/21.
 * @project DesignPatterns.Adapter
 **/
public class EuSocketCharger implements Charger{
    @Override
    public String charge() {
        return "Using European-Socket charger";
    }
}

package Adapter;

/**
 * @author Yağız Ünal on 11/4/21.
 * @project DesignPatterns.Adapter
 **/
public class UkSocketCharger implements Charger{
    @Override
    public String charge() {
        return "Using UK-Socket charger";
    }
}

package Adapter;

/**
 * @author Yağız Ünal on 11/4/21.
 * @project DesignPatterns.Adapter
 **/
public class UkToEuSocketAdapter implements SocketAdapter{
    private Charger charger;

    public UkToEuSocketAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public String useAdapter() {
        if(charger instanceof UkSocketCharger)
            return charger.charge()+" with EU adapter.";
        else
            return "<<Adapter is not supported with charger. Use UK charger!!>>";
    }
}

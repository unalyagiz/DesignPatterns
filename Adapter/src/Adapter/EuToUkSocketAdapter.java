package Adapter;

/**
 * @author Yağız Ünal on 11/4/21.
 * @project DesignPatterns.Adapter
 **/
public class EuToUkSocketAdapter implements SocketAdapter{
    private Charger charger;

    public EuToUkSocketAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public String useAdapter() {
        if(charger instanceof EuSocketCharger)
            return charger.charge()+" with UK adapter.";
        else
            return "<<Adapter is not supported with charger. Use EU charger!!>>";
    }
}

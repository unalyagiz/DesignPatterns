package Factory;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.Factory
 **/
public class Bmw implements Car{

    private String model;
    private String year;

    public Bmw(String model, String year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public void drive() {
        System.out.println("Bmw "+model+" "+year+" is on the Road."+" ["+this+"]");
    }
}

package Factory;

/**
 * @author Yağız Ünal on 10/18/21.
 * @project DesignPatterns.Factory
 **/
public class Mercedes implements Car{

    private String model;
    private String year;
    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getYear() {
        return year;
    }

    public Mercedes(String model, String year) {
        this.model = model;
        this.year = year;
    }
    @Override
    public void drive() {
        System.out.println("Mercedes "+model+" "+year+" is on the Road. "+"["+this+"]");
    }
}

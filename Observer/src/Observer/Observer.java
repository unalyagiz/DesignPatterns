package Observer;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public abstract class Observer {

    protected String name;

    public Observer(String name) {
        this.name = name;
    }
    public abstract void getNotification(Video video);
}

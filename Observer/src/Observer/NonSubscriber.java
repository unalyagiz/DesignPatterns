package Observer;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public class NonSubscriber extends Observer{

    public NonSubscriber(String name) {
        super(name);
    }

    @Override
    public void getNotification(Video video) {
        System.out.println(this.name+" [Non-Subscriber] ->New Video: \""+video.getTitle()+
                "\" from Channel: \""+video.channel.getChannelName()
                +"\" [push notifications ENABLED]");
    }
}

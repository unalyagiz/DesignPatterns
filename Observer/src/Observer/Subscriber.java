package Observer;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public  class Subscriber extends Observer{

    public Subscriber(String name) {
        super(name);
    }

    @Override
    public void getNotification(Video video) {
        System.out.println(this.name+" [Subscriber] -> New Video: \""+video.getTitle()+
                "\" from Channel: \""+video.channel.getChannelName() +"\"");
    }
}

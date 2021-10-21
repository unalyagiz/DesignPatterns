package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public class YoutubeChannel {
    private String channelName;
    private List<Observer> observers = new ArrayList<Observer>();

    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }
    public void uploadVideo(Video video){
        video.channel=this;
        notifyUsers(video);
    }

    public String getChannelName() {
        return channelName;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    private void notifyUsers(Video video){
        observers.forEach(subscriber->subscriber.getNotification(video));

    }
}


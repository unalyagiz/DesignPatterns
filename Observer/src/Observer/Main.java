package Observer;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel("Life with Code");
        Observer s1 = new Subscriber("Yağız");
        Observer s2 = new Subscriber("Ünal");
        Observer s3 = new NonSubscriber("Dave");
        Observer s4 = new NonSubscriber("Simon");

        youtubeChannel.addObserver(s1);
        youtubeChannel.addObserver(s2);
        youtubeChannel.addObserver(s3);
        youtubeChannel.addObserver(s4);

        Video v1 = new Video("Why MS Word Is Best For Coding?!?! Here is Why?");
        youtubeChannel.uploadVideo(v1);
        Video v2 = new Video("Fundamentals of Database Management Systems");

        System.out.println("*********************************");
        youtubeChannel.removeObserver(s1);
        youtubeChannel.uploadVideo(v2);
    }
}

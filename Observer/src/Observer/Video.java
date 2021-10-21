package Observer;

/**
 * @author Yağız Ünal on 10/21/21.
 * @project DesignPatterns.Observer
 **/
public class Video {
    private String title;
    protected YoutubeChannel channel;

    public String getTitle() {
        return title;
    }

    public Video(String title) {
        this.title = title;
    }
}

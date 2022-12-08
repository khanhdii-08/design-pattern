package observer_pattern;

public class VideoData extends Subject{
    private String title;
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.videoDataChange();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
        this.videoDataChange();
    }

    public VideoData(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public VideoData(){}

    private void videoDataChange(){
        String title = this.getTitle();
        String link = this.getLink();
        notifyAllObservers(this, null);
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

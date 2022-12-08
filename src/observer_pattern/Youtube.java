package observer_pattern;

public class Youtube extends Observer{
    public Youtube(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }


    @Override
    public void update(Subject subject, Object arg) {
        if(subject instanceof VideoData ){
            VideoData videoData = (VideoData) subject;
            System.out.printf("Notify all subscribers via FACEBOOK with new data"+
                    "\n\t title: %s"+
                    "\n\t link: %s\n", videoData.getTitle(), videoData.getLink()
            );
        }
    }
}

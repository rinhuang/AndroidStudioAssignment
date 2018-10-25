package objects;

public class Video {
    private String id;
    private String title;
    private String thumbnail;
    private String duration;
    private String url;

    public Video(String id) {
        this.id = id;
    }

    public Video (String id, String title, String duration, String thumbnail) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.thumbnail = thumbnail;
    }

    public String getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getDuration() {
        return duration;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}

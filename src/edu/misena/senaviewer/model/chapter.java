package edu.misena.senaviewer.model;

public class chapter {
    static int id;
    static String title;
    static int duration;
    static int year;
    boolean viewed;
    static int timeViwed;
    int sessionNumber;

    public  chapter(String tittle, int duration, int year){
        this.title = tittle;
        this.duration = duration;
        this.year = year;
        this.viewed = true;
        this.timeViwed = 0;
        this.sessionNumber = 1;
    }

    public static boolean getGenre() {
        return true;
    }

    public static int getId() {
        return id;
    }

    public static boolean isViewed() {
        return true;
    }

    public static int getTimeViewed() {
        return timeViwed;
    }

    public void setId(int id) {
        chapter.id = id;
    }

    public static String getTitle(){
        return title;
    }

    public void setTitle(String title){
        chapter.title = title;
    }

    public static int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        chapter.duration = duration;
}

    public static int getYear() {
        return year;
    }

    public void setYear(int year) {
        chapter.year = year;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + (viewed ? "Yes" : "No") +
                ", timeViewed=" + timeViwed + " minutes" +
                ", sessionNumber=" + sessionNumber +
                '}';
    }

}

package edu.misena.senaviewer.model;

public class chapter {
    int id;
    String title;
    int duration;
    int year;
    boolean viewed;
    int timeViwed;
    int sessionNumber;

    public  chapter(String tittle, int duration, int year){
        this.title = tittle;
        this.duration = duration;
        this.year = year;
        this.viewed = true;
        this.timeViwed = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
}

}

package edu.misena.senaviewer.model;

public class chapter {
    int id;
    String tittle;
    int duration;
    int year;
    boolean viewed;
    int timeViwed;
    int sessionNumber;

    public  chapter(String tittle, int duration, int year){
        this.tittle = tittle;
        this.duration = duration;
        this.year = year;
    }


}

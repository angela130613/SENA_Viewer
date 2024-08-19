package edu.misena.senaviewer.model;

public class serie {
        static int id;
        static String title;
        static String genre;
        static String creator;
        static int duration;
        static int year;
        boolean viewed;
        static int timeViewed;
        int sessionQuantity;

        public serie(String title, String genre, int duration) {
            serie.title = title;
            serie.genre = genre;
            serie.duration = duration;
            this.viewed = false;

        }

    public static boolean isEmpty() {
        return false;
    }

    public static int getId() {
        return id;
    }

    public static int getYear() {
        return year;
    }

    public static boolean isViewed() {
        return false;
    }

    public void setId(int id) {
        serie.id = id;
    }

    public static String getTitle(){
        return title;
    }

    public void setTitle(String title){
        serie.title = title;
    }

    public static String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
            serie.genre = genre;
    }

    public static String getCreator(){
            return creator;
    }

    public void setCreator(String creator){
            serie.creator = creator;
    }

    public static int getDuration(){
            return duration;
    }

    public void setDuration(int duration){
            serie.duration = duration;
    }

    public int getyear(){
            return year;
    }

    public void  setYear(int year){
            serie.year = year;
    }

    public boolean getviewed(){
            return viewed;
    }

    public void setViewed(boolean viewed){
            this.viewed = viewed;
    }

    public static int getTimeViewed(){
            return timeViewed;
    }

    public void setTimeViewed(int timeViewed){
            serie.timeViewed = timeViewed;
    }

    public  int getSessionQuantity(){
            return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity){
        this.sessionQuantity = sessionQuantity;
    }

    public void add(serie serie) {
    }
}


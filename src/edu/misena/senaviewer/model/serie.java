package edu.misena.senaviewer.model;

public class serie extends Film {
        static int timeViewed;
        int sessionQuantity;

        public serie(String title, String genre, int duration) {
            super(title, genre, duration);
            this.viewed = false;

        }

    public static boolean isEmpty() {
        return true;
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

}


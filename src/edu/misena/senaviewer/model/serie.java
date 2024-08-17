package edu.misena.senaviewer.model;

public class serie {
        int id;
        String title;
        String genre;
        String creator;
        int duration;
        int year;
        boolean viewed;
        int timeViewed;
        int sessionQuantity;

        public serie(String title, String genre, int duration) {
            this.title = title;
            this.genre = genre;
            this.duration = duration;
        }

}


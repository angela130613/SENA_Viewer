package edu.misena.senaviewer.model;


    public class movie {
        int id;
        String title;
        String genre;
        String creator;
        int duracion;
        short year;
        boolean viewed;
        int timeviwed;

        public movie(String title, String genre, String creator, int  duracion, short year){
            this.title = title;
            this.genre = genre;
            this.creator = creator;
            this.duracion = duracion;
            this.year = year;
        }
    }

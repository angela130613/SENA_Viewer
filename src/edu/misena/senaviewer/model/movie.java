package edu.misena.senaviewer.model;

    public class movie {
        int id;
        String title;
        String genre;
        String creator;
        int duracion;
        int year;
        boolean viewed;
        int timeviwed;

        public movie(String title, String genre, String creator, int  duracion, short year){
            this.title = title;
            this.genre = genre;
            this.creator = creator;
            this.duracion = duracion;
            this.year = year;
            this.viewed = false;
            this.timeviwed = 0;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getCreator() {
            return creator;
        }

        public int getDuration() {
            return duracion;
        }

        public void setDuration(int duration) {
            this.duracion = duration;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public boolean isViewed() {
            return viewed;
        }

        public void setViewed(boolean viewed) {
            this.viewed = viewed;
        }













    }

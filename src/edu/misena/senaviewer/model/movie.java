package edu.misena.senaviewer.model;

    public class movie extends Film {
        int timeviwed;

        public movie(String title, String genre, String creator, int  duracion, short year){
           super(title, genre, creator, duracion, year);
            this.timeviwed = 0;
        }

        public void setViewed(boolean viewed) {
            this.viewed = viewed;
        }

        public int getTimeViewed() {
            return timeviwed;
        }

        public void setTimeViewed(int timeViewed) {
            this.timeviwed = timeViewed;
}














    }

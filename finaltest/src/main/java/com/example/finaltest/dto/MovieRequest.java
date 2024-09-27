package com.example.finaltest.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieRequest {

        private String title;

        private String genre;

        private String duration;

        private String director;

        private String rating;

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

        public String getDuration() {
                return duration;
        }

        public void setDuration(String duration) {
                this.duration = duration;
        }

        public String getDirector() {
                return director;
        }

        public void setDirector(String director) {
                this.director = director;
        }

        public String getRating() {
                return rating;
        }

        public void setRating(String rating) {
                this.rating = rating;
        }
}

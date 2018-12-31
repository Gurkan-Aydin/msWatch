package com.example.ms_watch.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "episode")
public class Movies implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "video_link")
    private String videoLink;

    public Movies() {
    }

    public Movies(String videoLink) {
        this.videoLink = videoLink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}

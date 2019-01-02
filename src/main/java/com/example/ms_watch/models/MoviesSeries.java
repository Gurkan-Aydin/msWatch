package com.example.ms_watch.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "movies_series")
public class MoviesSeries implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String  title;

    @Column(name = "point")
    private int point;

    @Column(name = "cover")
    private String cover;

    @Column(name = "producer_id")
    private int producerId;

    @Column(name = "time")
    private int time;

    @Column(name = "release_date")
    private String  releaseDate;

    @Column(name = "is_series")
    private String isSeries;

    public MoviesSeries() {
    }


    public MoviesSeries(String title, int point, String cover, int producerId, int time, String releaseDate, String isSeries) {
        this.title = title;
        this.point = point;
        this.cover = cover;
        this.producerId = producerId;
        this.time = time;
        this.releaseDate = releaseDate;
        this.isSeries = isSeries;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getIsSeries() {
        return isSeries;
    }

    public void setIsSeries(String isSeries) {
        this.isSeries = isSeries;
    }
}

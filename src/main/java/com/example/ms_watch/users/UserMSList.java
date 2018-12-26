package com.example.ms_watch.users;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class UserMSList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ms_id")
    private int msId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "type")
    private String type;

    public UserMSList() {
    }

    public UserMSList(int msId, int userId, String type) {
        this.msId = msId;
        this.userId = userId;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsId() {
        return msId;
    }

    public void setMsId(int msId) {
        this.msId = msId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

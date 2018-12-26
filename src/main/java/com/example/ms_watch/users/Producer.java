package com.example.ms_watch.users;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producer")
public class Producer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "producer_name")
    private String producerName;

    public Producer() {
    }

    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
}

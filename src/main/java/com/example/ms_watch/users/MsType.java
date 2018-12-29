package com.example.ms_watch.users;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ms_type")
public class MsType implements Serializable {

    @Id
    @Column(name = "type_id")
    private int typeId;

    @Id
    @Column(name = "ms_id")
    private int msId;

    public MsType() {
    }

    public MsType(int typeId, int msId) {
        this.typeId = typeId;
        this.msId = msId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getMsId() {
        return msId;
    }

    public void setMsId(int msId) {
        this.msId = msId;
    }
}

package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_realty_address", schema = "public", catalog = "ICS_DB")
public class TRealtyAddressPOJO {
    private long id;
    private long idState;
    private long idAddress;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_state")
    public long getIdState() {
        return idState;
    }

    public void setIdState(long idState) {
        this.idState = idState;
    }

    @Basic
    @Column(name = "id_address")
    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRealtyAddressPOJO that = (TRealtyAddressPOJO) o;

        if (id != that.id) return false;
        if (idState != that.idState) return false;
        if (idAddress != that.idAddress) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idState ^ (idState >>> 32));
        result = 31 * result + (int) (idAddress ^ (idAddress >>> 32));
        return result;
    }
}

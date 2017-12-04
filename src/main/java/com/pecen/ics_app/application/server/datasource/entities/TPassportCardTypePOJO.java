package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_passport_card_type", schema = "public", catalog = "ICS_DB")
public class TPassportCardTypePOJO {
    private long id;
    private long idClient;
    private short series;
    private int number;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_client")
    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "series")
    public short getSeries() {
        return series;
    }

    public void setSeries(short series) {
        this.series = series;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPassportCardTypePOJO that = (TPassportCardTypePOJO) o;

        if (id != that.id) return false;
        if (idClient != that.idClient) return false;
        if (series != that.series) return false;
        if (number != that.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idClient ^ (idClient >>> 32));
        result = 31 * result + (int) series;
        result = 31 * result + number;
        return result;
    }
}

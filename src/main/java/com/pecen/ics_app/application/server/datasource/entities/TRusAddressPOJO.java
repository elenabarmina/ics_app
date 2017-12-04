package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_rus_address", schema = "public", catalog = "ICS_DB")
public class TRusAddressPOJO {
    private long id;
    private long idCity;
    private String street;
    private String house;
    private String building;
    private String corpus;
    private String flat;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_city")
    public long getIdCity() {
        return idCity;
    }

    public void setIdCity(long idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "house")
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Basic
    @Column(name = "building")
    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Basic
    @Column(name = "corpus")
    public String getCorpus() {
        return corpus;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    @Basic
    @Column(name = "flat")
    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRusAddressPOJO that = (TRusAddressPOJO) o;

        if (id != that.id) return false;
        if (idCity != that.idCity) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (house != null ? !house.equals(that.house) : that.house != null) return false;
        if (building != null ? !building.equals(that.building) : that.building != null) return false;
        if (corpus != null ? !corpus.equals(that.corpus) : that.corpus != null) return false;
        if (flat != null ? !flat.equals(that.flat) : that.flat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idCity ^ (idCity >>> 32));
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (house != null ? house.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + (corpus != null ? corpus.hashCode() : 0);
        result = 31 * result + (flat != null ? flat.hashCode() : 0);
        return result;
    }
}

package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_city", schema = "public", catalog = "ICS_DB")
public class TCityPOJO {
    private long id;
    private long idType;
    private long idRegion;
    private long idParent;
    private String name;
    private Boolean isRegionCenter;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_type")
    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "id_region")
    public long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(long idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "id_parent")
    public long getIdParent() {
        return idParent;
    }

    public void setIdParent(long idParent) {
        this.idParent = idParent;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "is_region_center")
    public Boolean getRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(Boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCityPOJO tCityPOJO = (TCityPOJO) o;

        if (id != tCityPOJO.id) return false;
        if (idType != tCityPOJO.idType) return false;
        if (idRegion != tCityPOJO.idRegion) return false;
        if (idParent != tCityPOJO.idParent) return false;
        if (name != null ? !name.equals(tCityPOJO.name) : tCityPOJO.name != null) return false;
        if (isRegionCenter != null ? !isRegionCenter.equals(tCityPOJO.isRegionCenter) : tCityPOJO.isRegionCenter != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idType ^ (idType >>> 32));
        result = 31 * result + (int) (idRegion ^ (idRegion >>> 32));
        result = 31 * result + (int) (idParent ^ (idParent >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isRegionCenter != null ? isRegionCenter.hashCode() : 0);
        return result;
    }
}

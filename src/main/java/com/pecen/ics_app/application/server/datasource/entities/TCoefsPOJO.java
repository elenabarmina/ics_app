package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_coefs", schema = "public", catalog = "ICS_DB")
public class TCoefsPOJO {
    private long id;
    private Long idCoefType;
    private BigInteger value;
    private int version;
    private BigInteger lessThan;
    private BigInteger greaterThan;
    private BigInteger equalTo;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_coef_type")
    public Long getIdCoefType() {
        return idCoefType;
    }

    public void setIdCoefType(Long idCoefType) {
        this.idCoefType = idCoefType;
    }

    @Basic
    @Column(name = "value")
    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "less_than")
    public BigInteger getLessThan() {
        return lessThan;
    }

    public void setLessThan(BigInteger lessThan) {
        this.lessThan = lessThan;
    }

    @Basic
    @Column(name = "greater_than")
    public BigInteger getGreaterThan() {
        return greaterThan;
    }

    public void setGreaterThan(BigInteger greaterThan) {
        this.greaterThan = greaterThan;
    }

    @Basic
    @Column(name = "equal_to")
    public BigInteger getEqualTo() {
        return equalTo;
    }

    public void setEqualTo(BigInteger equalTo) {
        this.equalTo = equalTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCoefsPOJO that = (TCoefsPOJO) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (idCoefType != null ? !idCoefType.equals(that.idCoefType) : that.idCoefType != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (lessThan != null ? !lessThan.equals(that.lessThan) : that.lessThan != null) return false;
        if (greaterThan != null ? !greaterThan.equals(that.greaterThan) : that.greaterThan != null) return false;
        if (equalTo != null ? !equalTo.equals(that.equalTo) : that.equalTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (idCoefType != null ? idCoefType.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (lessThan != null ? lessThan.hashCode() : 0);
        result = 31 * result + (greaterThan != null ? greaterThan.hashCode() : 0);
        result = 31 * result + (equalTo != null ? equalTo.hashCode() : 0);
        return result;
    }
}

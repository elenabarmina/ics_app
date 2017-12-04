package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_fortune_contract", schema = "public", catalog = "ICS_DB")
public class TFortuneContractPOJO {
    private long id;
    private long idFortuneType;
    private long idAddress;
    private long idInsuranceContract;
    private short builtYear;
    private BigInteger floorArea;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_fortune_type")
    public long getIdFortuneType() {
        return idFortuneType;
    }

    public void setIdFortuneType(long idFortuneType) {
        this.idFortuneType = idFortuneType;
    }

    @Basic
    @Column(name = "id_address")
    public long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(long idAddress) {
        this.idAddress = idAddress;
    }

    @Basic
    @Column(name = "id_insurance_contract")
    public long getIdInsuranceContract() {
        return idInsuranceContract;
    }

    public void setIdInsuranceContract(long idInsuranceContract) {
        this.idInsuranceContract = idInsuranceContract;
    }

    @Basic
    @Column(name = "built_year")
    public short getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(short builtYear) {
        this.builtYear = builtYear;
    }

    @Basic
    @Column(name = "floor_area")
    public BigInteger getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(BigInteger floorArea) {
        this.floorArea = floorArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TFortuneContractPOJO that = (TFortuneContractPOJO) o;

        if (id != that.id) return false;
        if (idFortuneType != that.idFortuneType) return false;
        if (idAddress != that.idAddress) return false;
        if (idInsuranceContract != that.idInsuranceContract) return false;
        if (builtYear != that.builtYear) return false;
        if (floorArea != null ? !floorArea.equals(that.floorArea) : that.floorArea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idFortuneType ^ (idFortuneType >>> 32));
        result = 31 * result + (int) (idAddress ^ (idAddress >>> 32));
        result = 31 * result + (int) (idInsuranceContract ^ (idInsuranceContract >>> 32));
        result = 31 * result + (int) builtYear;
        result = 31 * result + (floorArea != null ? floorArea.hashCode() : 0);
        return result;
    }
}

package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_link_fortune_contract_coefs", schema = "public", catalog = "ICS_DB")
public class TLinkFortuneContractCoefsPOJO {
    private long id;
    private long idContract;
    private long idCoef;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_contract")
    public long getIdContract() {
        return idContract;
    }

    public void setIdContract(long idContract) {
        this.idContract = idContract;
    }

    @Basic
    @Column(name = "id_coef")
    public long getIdCoef() {
        return idCoef;
    }

    public void setIdCoef(long idCoef) {
        this.idCoef = idCoef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TLinkFortuneContractCoefsPOJO that = (TLinkFortuneContractCoefsPOJO) o;

        if (id != that.id) return false;
        if (idContract != that.idContract) return false;
        if (idCoef != that.idCoef) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idContract ^ (idContract >>> 32));
        result = 31 * result + (int) (idCoef ^ (idCoef >>> 32));
        return result;
    }
}

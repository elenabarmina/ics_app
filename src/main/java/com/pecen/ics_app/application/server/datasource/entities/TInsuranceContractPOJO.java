package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_insurance_contract", schema = "public", catalog = "ICS_DB")
public class TInsuranceContractPOJO {
    private long id;
    private long idClient;
    private long idCreator;
    private long idDocument;
    private double premium;
    private Date validityDateFrom;
    private Date validityDateTo;
    private double insuredSum;
    private int contractVersion;
    private Date calculationDate;
    private String comment;

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
    @Column(name = "id_creator")
    public long getIdCreator() {
        return idCreator;
    }

    public void setIdCreator(long idCreator) {
        this.idCreator = idCreator;
    }

    @Basic
    @Column(name = "id_document")
    public long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(long idDocument) {
        this.idDocument = idDocument;
    }

    @Basic
    @Column(name = "premium")
    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Basic
    @Column(name = "validity_date_from")
    public Date getValidityDateFrom() {
        return validityDateFrom;
    }

    public void setValidityDateFrom(Date validityDateFrom) {
        this.validityDateFrom = validityDateFrom;
    }

    @Basic
    @Column(name = "validity_date_to")
    public Date getValidityDateTo() {
        return validityDateTo;
    }

    public void setValidityDateTo(Date validityDateTo) {
        this.validityDateTo = validityDateTo;
    }

    @Basic
    @Column(name = "insured_sum")
    public double getInsuredSum() {
        return insuredSum;
    }

    public void setInsuredSum(double insuredSum) {
        this.insuredSum = insuredSum;
    }

    @Basic
    @Column(name = "contract_version")
    public int getContractVersion() {
        return contractVersion;
    }

    public void setContractVersion(int contractVersion) {
        this.contractVersion = contractVersion;
    }

    @Basic
    @Column(name = "calculation_date")
    public Date getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TInsuranceContractPOJO that = (TInsuranceContractPOJO) o;

        if (id != that.id) return false;
        if (idClient != that.idClient) return false;
        if (idCreator != that.idCreator) return false;
        if (idDocument != that.idDocument) return false;
        if (Double.compare(that.premium, premium) != 0) return false;
        if (Double.compare(that.insuredSum, insuredSum) != 0) return false;
        if (contractVersion != that.contractVersion) return false;
        if (validityDateFrom != null ? !validityDateFrom.equals(that.validityDateFrom) : that.validityDateFrom != null)
            return false;
        if (validityDateTo != null ? !validityDateTo.equals(that.validityDateTo) : that.validityDateTo != null)
            return false;
        if (calculationDate != null ? !calculationDate.equals(that.calculationDate) : that.calculationDate != null)
            return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (idClient ^ (idClient >>> 32));
        result = 31 * result + (int) (idCreator ^ (idCreator >>> 32));
        result = 31 * result + (int) (idDocument ^ (idDocument >>> 32));
        temp = Double.doubleToLongBits(premium);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (validityDateFrom != null ? validityDateFrom.hashCode() : 0);
        result = 31 * result + (validityDateTo != null ? validityDateTo.hashCode() : 0);
        temp = Double.doubleToLongBits(insuredSum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + contractVersion;
        result = 31 * result + (calculationDate != null ? calculationDate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}

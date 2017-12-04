package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_user", schema = "public", catalog = "ICS_DB")
public class TUserPOJO {
    private long id;
    private String firstName;
    private String lastName;
    private String middleName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserPOJO tUserPOJO = (TUserPOJO) o;

        if (id != tUserPOJO.id) return false;
        if (firstName != null ? !firstName.equals(tUserPOJO.firstName) : tUserPOJO.firstName != null) return false;
        if (lastName != null ? !lastName.equals(tUserPOJO.lastName) : tUserPOJO.lastName != null) return false;
        if (middleName != null ? !middleName.equals(tUserPOJO.middleName) : tUserPOJO.middleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        return result;
    }
}

package com.pecen.ics_app.application.server.datasource.entities;

import javax.persistence.*;

/**
 * Created by pechen on 04.12.2017.
 */
@Entity
@Table(name = "t_city_type", schema = "public", catalog = "ICS_DB")
public class TCityTypePOJO {
    private long id;
    private String name;
    private String shortcut;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "shortcut")
    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCityTypePOJO that = (TCityTypePOJO) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (shortcut != null ? !shortcut.equals(that.shortcut) : that.shortcut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (shortcut != null ? shortcut.hashCode() : 0);
        return result;
    }
}

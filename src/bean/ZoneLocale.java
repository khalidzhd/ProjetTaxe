/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author khalid
 */
@Entity
public class ZoneLocale implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
    private List<Secteur> secteurs;
    @OneToMany
    private List<LocaleConstruction> locals;

    public Long getId() {
        return id;
    }

    public ZoneLocale(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public List<LocaleConstruction> getLocals() {
        return locals;
    }

    public void setLocals(List<LocaleConstruction> locals) {
        this.locals = locals;
    }

    public ZoneLocale() {
    }

    public ZoneLocale(Long id) {
        this.id = id;
    }

    public ZoneLocale(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZoneLocale)) {
            return false;
        }
        ZoneLocale other = (ZoneLocale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ZoneLocal{" + "id=" + id + '}';
    }

}

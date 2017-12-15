/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author khalid
 */
@Entity
public class LocaleConstruction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @ManyToOne
    private Secteur secteur;
    @ManyToOne
    private ZoneLocale zone;
    @OneToOne
    private Categorie categorie;
    

    public ZoneLocale getZone() {
        return zone;
    }

    public void setZone(ZoneLocale zone) {
        this.zone = zone;
    }

    public LocaleConstruction() {
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public LocaleConstruction(String id) {
        this.id = id;
    }

  
    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (!(object instanceof LocaleConstruction)) {
            return false;
        }
        LocaleConstruction other = (LocaleConstruction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Construction[ id=" + id + " ]";
    }

}

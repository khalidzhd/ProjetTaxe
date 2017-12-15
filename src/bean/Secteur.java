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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author khalid
 */
@Entity
public class Secteur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;
    private Double montant;
    @ManyToOne
    private ZoneLocale zone;
    @OneToMany
    private List<LocaleConstruction> locals;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public ZoneLocale getZone() {
        return zone;
    }

    public void setZone(ZoneLocale zone) {
        this.zone = zone;
    }

    public List<LocaleConstruction> getLocals() {
        return locals;
    }

    public void setLocals(List<LocaleConstruction> locals) {
        this.locals = locals;
    }

    public Secteur() {
    }

    public Secteur(Double id) {
        this.id = id;
    }

    public Secteur(Double id, Double montant) {
        this.id = id;
        this.montant = montant;
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
        if (!(object instanceof Secteur)) {
            return false;
        }
        Secteur other = (Secteur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Secteur{" + "id=" + id + ", montant=" + montant + '}';
    }

   

   

}

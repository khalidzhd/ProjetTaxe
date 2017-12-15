/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author khalid
 */
@Entity
public class TauxTaxe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Double id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateApp;
    @OneToOne
    private Categorie categorie;
    private Double montant;

    public TauxTaxe(Double id, Date dateApp, Double montant) {
        this.id = id;
        this.dateApp = dateApp;
        this.montant = montant;
    }

    public TauxTaxe(Double id) {
        this.id = id;
    }

    public TauxTaxe() {
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Date getDateApp() {
        return dateApp;
    }

    public void setDateApp(Date dateApp) {
        this.dateApp = dateApp;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
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
        if (!(object instanceof TauxTaxe)) {
            return false;
        }
        TauxTaxe other = (TauxTaxe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TauxTaxe{" + "id=" + id + ", dateApp=" + dateApp + ", categorie=" + categorie + ", montant=" + montant + '}';
    }

}

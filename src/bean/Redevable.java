/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author khalid
 */
@Entity
public class Redevable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nom;
    private String prenom;
    private int age;
    private String cin  ;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    

  

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

  
    public Redevable(String id) {
        this.id = id;
    }

    public Redevable() {
    }

    public Redevable(String id, String nom, String prenom, int age,String cin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.cin= cin;
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
        if (!(object instanceof Redevable)) {
            return false;
        }
        Redevable other = (Redevable) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Redevable{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }

}

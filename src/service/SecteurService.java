/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Secteur;
import bean.ZoneLocale;
import java.util.List;

/**
 *
 * @author khalid
 */
public class SecteurService extends AbstractFacade<Secteur> {

    public SecteurService() {
        super(Secteur.class);
    }
    public int initSecteur(String nom , int montant,ZoneLocale zone){
        Secteur secteur = new Secteur();
        secteur.setNom(nom);
        secteur.setMontant(montant);
        secteur.setZone(zone);
        create(secteur);
        return 1;
    }
    public List<Secteur> findByZone(String nom){
        return getEntityManager().createQuery("select s FROM Secteur s WHERE s.zone.name= '"+nom+"'").getResultList();
    }
    public Secteur findSecteur(String nom){
        return  getUniqueResult("select s FROM Secteur s WHERE s.nom= '"+nom+"'");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;

/**
 *
 * @author khalid
 */
public class CategorieService extends AbstractFacade<Categorie>{
    
    public CategorieService() {
        super(Categorie.class);
    }
    
    public int initCategorie(int m,String nom){
        Categorie categorie = new  Categorie();
        categorie.setNom(nom);
        categorie.setMontant(m);
        create(categorie);
        return 1;
        
    }
    public Categorie findCategorie(String nom){
        return  (Categorie) getUniqueResult("select c FROM Categorie c WHERE c.nom= '"+nom+"'");
    }
    
  

    
}

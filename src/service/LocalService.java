/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import bean.Categorie;
import bean.LocaleConstruction;
import bean.Secteur;
import bean.ZoneLocale;
import view.Local;

/**
 *
 * @author khalid
 */
public class LocalService extends AbstractFacade<Local>{
    
    public LocalService() {
        super(Local.class);
    }
        public int creeLocal (String id ,Secteur secteur ,ZoneLocale zone ,Categorie categorie ){
            LocaleConstruction localeConstruction = new LocaleConstruction();
            localeConstruction.setId(id);
            localeConstruction.setSecteur(secteur);
            localeConstruction.setZone(zone);
            localeConstruction.setCategorie(categorie);
        
        return 1;
        
    }
    
    
    
    
}

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
public class LocalConstructionService extends AbstractFacade<LocaleConstruction> {

    SecteurService secteurService = new SecteurService();
    ZoneLocaleService zoneLocaleService = new ZoneLocaleService();
    CategorieService categorieService = new CategorieService();

    public LocalConstructionService() {
        super(LocaleConstruction.class);
    }

    public int creeLocal(String id, String  nomSecteur, String nomZone, String nomCategorie) {
        LocaleConstruction localeConstruction = new LocaleConstruction();
        
        localeConstruction.setId(id);
        Secteur s = secteurService.findSecteur(nomSecteur);
        localeConstruction.setSecteur(s);
        ZoneLocale z = zoneLocaleService.findZone(nomZone);
        localeConstruction.setZone(z);
        Categorie c =categorieService.findCategorie(nomCategorie);
        localeConstruction.setCategorie(c);
        create(localeConstruction);
        return 1;
    }

}

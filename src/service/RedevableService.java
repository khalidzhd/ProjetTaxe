/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Redevable;

/**
 *
 * @author khalid
 */
public class RedevableService extends AbstractFacade<Redevable>{
    
    public RedevableService() {
        super(Redevable.class);
    }
     
    
    public int creeRedevable (String id ,String nom ,String prenom,String cin,int age ){
        Redevable redevable = new Redevable();
        redevable.setId(id);
        redevable.setNom(nom);
        redevable.setPrenom(prenom);
        redevable.setAge(age);
        redevable.setCin(cin);
        create(redevable);
        return 1;
        
    }
    
    
    
    
    
}

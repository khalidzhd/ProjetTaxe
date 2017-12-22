/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.ZoneLocale;

/**
 *
 * @author khalid
 */
public class ZoneLocaleService extends AbstractFacade<ZoneLocale>{
    
    public ZoneLocaleService() {
        super(ZoneLocale.class);
    }
    
    public int initZone (String name){
        ZoneLocale zoneLocale=new ZoneLocale();
        zoneLocale.setName(name);
        create(zoneLocale);
        return 1;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;


import bean.Secteur;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class SecteurHelper extends AbstractHelper<Secteur> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID ", "id"),
            new AbstractHelperItem("NOM", "nom"),
            new AbstractHelperItem("MONTANT ", "montant")};
          

    }

    public SecteurHelper(JTable jTable, List<Secteur> list) {
        super(titres, jTable, list);
    }

    public SecteurHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public SecteurHelper(JTable jTable) {
        super(titres, jTable);
    }
}

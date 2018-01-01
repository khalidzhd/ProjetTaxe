/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;


import bean.LocaleConstruction;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class LocalHelper extends AbstractHelper<LocaleConstruction> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID ", "id"),
            new AbstractHelperItem("CATEGORIE", "categorie"),
            new AbstractHelperItem("ZONE", "zone"),
            new AbstractHelperItem("SECTEUR ", "secteur")};
          

    }

    public LocalHelper(JTable jTable, List<LocaleConstruction> list) {
        super(titres, jTable, list);
    }

    public LocalHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public LocalHelper(JTable jTable) {
        super(titres, jTable);
    }
}

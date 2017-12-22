/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;


import bean.ZoneLocale;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class ZoneLocaleHelper extends AbstractHelper<ZoneLocale> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("ID ", "id"),
            new AbstractHelperItem("NOM", "name")};
          

    }

    public ZoneLocaleHelper(JTable jTable, List<ZoneLocale> list) {
        super(titres, jTable, list);
    }

    public ZoneLocaleHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public ZoneLocaleHelper(JTable jTable) {
        super(titres, jTable);
    }
}

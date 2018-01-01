/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pzt;

import bean.LocaleConstruction;
import java.awt.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import service.LocalConstructionService;

/**
 *
 * @author khalid
 */
public class FXMLDocumentController implements Initializable {
   @FXML
    private ComboBox local;
    @FXML
    private ComboBox redevable;
    @FXML
    private TextField metrage;
    @FXML
    private DatePicker datePre;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public ComboBox getLocal() {
        return local;
    }

    public void setLocal(ComboBox local) {
        this.local = local;
    }

    public ComboBox getRedevable() {
        return redevable;
    }

    public void setRedevable(ComboBox redevable) {
        this.redevable = redevable;
    }

    public TextField getMetrage() {
        return metrage;
    }

    public void setMetrage(TextField metrage) {
        this.metrage = metrage;
    }

    public DatePicker getDatePre() {
        return datePre;
    }

    public void setDatePre(DatePicker datePre) {
        this.datePre = datePre;
    }

    private void initCombobox1() {
        List<LocaleConstruction> locals = new ArrayList();
        LocalConstructionService localConstructionService = new LocalConstructionService();

        locals = localConstructionService.findAll();
        local.getItems().add("--SELECT--");
        for (int i = 0; i < locals.size(); i++) {
            LocaleConstruction lc = locals.get(i);
            local.getItems().add(lc.getId());
        }
    }

}
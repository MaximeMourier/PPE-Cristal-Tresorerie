/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristal.tresorerie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author user
 */
public class RootLayoutController implements Initializable {

    private MainApp main;
    
    @FXML
    private TabPane myTabPane1;
    
    @FXML
    private TreeView myTreeView;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setMain(MainApp main) {
        this.main = main;
    }
    
}

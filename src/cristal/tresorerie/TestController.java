
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package cristal.tresorerie;

//~--- non-JDK imports --------------------------------------------------------

import javafx.fxml.Initializable;

//~--- JDK imports ------------------------------------------------------------

import java.net.URL;

import java.util.ResourceBundle;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 * @author user
 */
public class TestController implements Initializable {

    private NewFXMain main;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
    }
    
    @FXML
    private void handleClick() {
        System.out.print("Click\n");
        main.showTest2();
    }

    public void setMain(NewFXMain main) {
        this.main = main;
    }

    


    
    
    
}


//~ Formatted by Jindent --- http://www.jindent.com

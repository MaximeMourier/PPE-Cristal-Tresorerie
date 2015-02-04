
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package cristal.tresorerie;

//~--- non-JDK imports --------------------------------------------------------

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import static javafx.application.Application.launch;

/**
 *
 * @author user
 */
public class MainApp extends Application {
    private Stage      primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {

        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Trace Route V0.1");
        initRootLayout();
        showStartPage();
    }

    public void initRootLayout() {
        try {

            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(MainApp.class.getResource("/cristal/tresorerie/view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);

            primaryStage.setScene(scene);

            
            // Give the controller access to the main app.
            RootLayoutController controller = loader.getController();
            controller.setMain(this);
            
            
            
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showStartPage() {
        try {

            // Load person overview.
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(MainApp.class.getResource("/cristal/tresorerie/view/StartPage.fxml"));

            AnchorPane MainView = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(MainView);

            // Give the controller access to the main app.
            StartPageController controller = loader.getController();
            controller.setMain(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

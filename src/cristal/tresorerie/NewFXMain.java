
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

/**
 *
 * @author user
 */
public class NewFXMain extends Application {
    private Stage      primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {

        /*
         * Button btn = new Button();
         * btn.setText("Say 'Hello World'");
         * btn.setOnAction(new EventHandler<ActionEvent>() {
         *
         *   @Override
         *   public void handle(ActionEvent event) {
         *       System.out.println("Hello World!");
         *   }
         * });
         *
         * StackPane root = new StackPane();
         * root.getChildren().add(btn);
         *
         * Scene scene = new Scene(root, 300, 250);
         *
         * primaryStage.setTitle("Hello World!");
         * primaryStage.setScene(scene);
         * primaryStage.show();
         */
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        initRootLayout();
        showTest();
    }

    public void initRootLayout() {
        try {

            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(NewFXMain.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);

            primaryStage.setScene(scene);

            
            // Give the controller access to the main app.
            RootLayoutController controller = loader.getController();
            //System.out.println(controller.toString());
            controller.setMain(this);
            
            
            
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showTest() {
        try {

            // Load person overview.
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(NewFXMain.class.getResource("view/Test.fxml"));

            AnchorPane Test = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(Test);

            // Give the controller access to the main app.
            TestController controller = loader.getController();
            controller.setMain(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showTest2() {
        try {

            // Load person overview.
            FXMLLoader loader = new FXMLLoader();

            loader.setLocation(NewFXMain.class.getResource("view/test2.fxml"));

            AnchorPane Test = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(Test);
            
            // Give the controller access to the main app.
            Test2Controller controller = loader.getController();
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

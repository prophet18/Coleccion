package frameworks;

import java.io.*;
import java.util.*;

import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GameGUI extends Application {
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
				
		
		Label sYear = new Label("FUCK");
		
		Scene sceneTwo = new Scene(sYear, 1000, 500);
        primaryStage.setScene(sceneTwo);

        primaryStage.setTitle("Colección");
        primaryStage.show();
		
	}
	
	public static void main(String[] args) {		
		
        launch(args);
    }

	
}




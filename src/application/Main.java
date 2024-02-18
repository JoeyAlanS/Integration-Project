package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.File;

public class Main extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		String iconPath = "src/icons/icon_logo_eletra.png";

        
        File iconFile = new File(iconPath);
        
        
        Image icon = new Image(iconFile.toURI().toString());
        
       
        stage.getIcons().add(icon);
        
		Parent root = FXMLLoader.load(getClass().getResource("/resources/MainView.fxml"));

		Scene scene = new Scene(root, 300, 275);
		
		 scene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());
		
		stage.setTitle("Projeto integração");
		stage.setScene(scene);
		stage.show();
	}
}
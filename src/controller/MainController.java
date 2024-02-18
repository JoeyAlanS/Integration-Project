package controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TreeView<String> treeView;

    @FXML
    private TitledPane titledLineup;

    @FXML
    private TitledPane titledModels;

    @FXML
    private Accordion accordion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        comboBox.setItems(FXCollections.observableArrayList("Cronos", "Ares"));

       
        comboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                
                treeReference(newValue);
            }
        });
        
    }

    public void treeReference(String newValue) {
      
        TreeItem<String> rootItem = new TreeItem<>(newValue);

        if ("Cronos".equals(newValue)) {
        	//CRONOS CATEGORY
            TreeItem<String> categoryItem1 = new TreeItem<>("Cronos NG");
            TreeItem<String> categoryItem2 = new TreeItem<>("Cronos Old");
            TreeItem<String> categoryItem3 = new TreeItem<>("Cronos L");
            
            //CRONOS NG
            TreeItem<String> modelItem1 = new TreeItem<>("Cronos 6001-NG");
            TreeItem<String> modelItem2 = new TreeItem<>("Cronos 6003-NG");
            TreeItem<String> modelItem3 = new TreeItem<>("Cronos 6021-NG");
            TreeItem<String> modelItem4 = new TreeItem<>("Cronos 6031-NG");
            TreeItem<String> modelItem5 = new TreeItem<>("Cronos 7021-NG");
            TreeItem<String> modelItem6 = new TreeItem<>("Cronos 7023-NG");
            
            //CRONOS Old
            TreeItem<String> modelItem7 = new TreeItem<>("Cronos 6001-A");
            TreeItem<String> modelItem8 = new TreeItem<>("Cronos 6003");
            TreeItem<String> modelItem9 = new TreeItem<>("Cronos 7023");
            
            
            //CRONOS L
            TreeItem<String> modelItem10 = new TreeItem<>("Cronos 6021L");
            TreeItem<String> modelItem11 = new TreeItem<>("Cronos 6021L");
            TreeItem<String> modelItem12 = new TreeItem<>("Cronos 7023L");
            
            categoryItem1.getChildren().addAll(modelItem1, modelItem2, modelItem3, modelItem4, modelItem5, modelItem6);
            categoryItem2.getChildren().addAll(modelItem7, modelItem8, modelItem9);
            categoryItem3.getChildren().addAll(modelItem10, modelItem11, modelItem12);
            
            rootItem.getChildren().addAll(categoryItem1,categoryItem2,categoryItem3);
        }
        if ("Ares".equals(newValue)) {
            
            //ARES CATEGORY
            TreeItem<String> categoryItem1 = new TreeItem<>("Ares TB");
            TreeItem<String> categoryItem2 = new TreeItem<>("Ares THS");
            
            //ARES TB
            TreeItem<String> modelItem1 = new TreeItem<>("ARES 7021");
            TreeItem<String> modelItem2 = new TreeItem<>("ARES 7031");
            TreeItem<String> modelItem3 = new TreeItem<>("ARES 7023");
            
            //ARES THS
            TreeItem<String> modelItem4 = new TreeItem<>("ARES 8023 15");
            TreeItem<String> modelItem5 = new TreeItem<>("ARES 8023 200");
            TreeItem<String> modelItem6 = new TreeItem<>("ARES 8023 2,5");

            
            categoryItem1.getChildren().addAll(modelItem1, modelItem2, modelItem3);
            categoryItem2.getChildren().addAll(modelItem4, modelItem5,modelItem6);         

            rootItem.getChildren().addAll(categoryItem1, categoryItem2);
        }

        
        treeView.setRoot(rootItem);
    }
}

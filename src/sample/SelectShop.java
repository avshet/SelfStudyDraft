package sample;

import BackEnd.ShopOwner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;

public class SelectShop extends Main{

    public static String shop ="ShopB";
    @FXML
    public ChoiceBox<String> select = new ChoiceBox<>();

    @FXML
    private Button but;

    @FXML
    private void initialize(){
        select.setValue("SHOPA");
        select.getItems().addAll("SHOPA","SHOPB","SHOPC","SHOPD");
    }

    @FXML
    void pressed(ActionEvent event) throws IOException {
        SelectShop m = new SelectShop();
        ShopOwner sh = new ShopOwner();
        if(select.getValue().equals("SHOPA")) {
            SelectShop.shop = "SHOP-A";
            m.changeScene("selectfood.fxml", 575, 370);
        }
        else if(select.getValue().equals("SHOPB")) {
            SelectShop.shop = "SHOP-B";
            m.changeScene("selectfood.fxml", 575, 370);
        }
        else if(select.getValue().equals("SHOPC")) {
            SelectShop.shop = "SHOP-C";
            m.changeScene("selectfood.fxml", 575, 370);
        }
        else{
            SelectShop.shop = "SHOP-D";
            m.changeScene("selectfood.fxml", 575, 370);
        }

    }

    public void changeScene(String fxml, int breadth, int height) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane,breadth,height));
        stg.getScene().setRoot(pane);
    }
}
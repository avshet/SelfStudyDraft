package sample;

import BackEnd.*;
import BackEnd.shopA;
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
            SelectFood.sh = new shopA();
            Feedback.shopselect =1;
        }
        else if(select.getValue().equals("SHOPB")) {
            SelectShop.shop = "SHOP-B";
            SelectFood.sh = new shopB();
            Feedback.shopselect =2;
        }
        else if(select.getValue().equals("SHOPC")) {
            SelectShop.shop = "SHOP-C";
            SelectFood.sh = new shopC();
            Feedback.shopselect =3;
        }
        else{
            SelectShop.shop = "SHOP-D";
            SelectFood.sh = new shopD();
            Feedback.shopselect =4;
        }
        m.changeScene("selectfood.fxml", 565, 338);
    }

    public void changeScene(String fxml, int breadth, int height) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane,breadth,height));
        stg.getScene().setRoot(pane);
    }
}
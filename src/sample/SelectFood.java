package sample;

import BackEnd.Login;
import BackEnd.ShopOwner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class SelectFood {

    public double amount = 0;
    @FXML
    private Label shopshow;

    @FXML
    private CheckBox C11;

    @FXML
    private CheckBox C12;

    @FXML
    private CheckBox C14;

    @FXML
    private CheckBox C13;

    @FXML
    private Button ADD;
    @FXML
    private Button pay;

    @FXML
    private Label cart;
    public static ShopOwner sh;

    @FXML
    private void initialize(){
        shopshow.setText(SelectShop.shop);
        System.out.println(SelectShop.shop);
    }
    @FXML
    void ADDCART(ActionEvent event) throws IOException {
        if(C11.isSelected()){
            sh.AddItems("itemA",10.0);
        }
        if(C12.isSelected()){
            sh.AddItems("itemA",20.0);
        }
        if(C13.isSelected()){
            sh.AddItems("itemA",30.0);
        }
        if(C14.isSelected()){
            sh.AddItems("itemA",40.0);
        }
        C11.setSelected(false);
        C12.setSelected(false);
        C13.setSelected(false);
        C14.setSelected(false);
        cart.setText("Cart value is "+sh.showlist());
    }

    @FXML
    void payment(ActionEvent event) throws IOException {
        sh.GenerateBill();
        LogIn m = new LogIn();
        m.changeScene("feedback.fxml",600,400);
    }

}

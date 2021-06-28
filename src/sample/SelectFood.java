package sample;

import BackEnd.Login;
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


    @FXML
    private void initialize(){
        shopshow.setText(SelectShop.shop);
        System.out.println(SelectShop.shop);
    }
    @FXML
    void ADDCART(ActionEvent event) throws IOException {
        if(C11.isSelected()&&C12.isSelected()&&C13.isSelected()&&C14.isSelected())
            amount = amount + 100;

        cart.setText("Cart value is "+amount);
    }

    @FXML
    void payment(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("feedback.fxml");
    }

}

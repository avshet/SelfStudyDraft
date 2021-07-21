package sample;

import BackEnd.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.io.IOException;

public class Feedback {

    @FXML
    private Button b1;

    @FXML
    private Slider slider;

    public static int shopselect;
    @FXML
    private Button b2;

    @FXML
    private Label shopname;

    @FXML
    private Button submit;

    @FXML
    private Label cur;

    @FXML
    private void initialize(){
        shopname.setText(SelectShop.shop);
        cur.setText(Double.toString(rating()));
        slider.setValue(rating());
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        LogIn m = new LogIn();
        m.changeScene("sample.fxml",600,350);
    }

    @FXML
    void newbill(ActionEvent event) throws IOException {
        LogIn m = new LogIn();
        m.changeScene("selectshop.fxml",140,160);
    }


    @FXML
    void sub(ActionEvent event) {
        switch (Feedback.shopselect) {
            case 1 -> {
                shopA.ratingupdate(slider.getValue());
                cur.setText(Double.toString(rating()));
            }
            case 2 -> {
                shopB.ratingupdate(slider.getValue());
                cur.setText(Double.toString(rating()));
            }
            case 3 -> {
                shopC.ratingupdate(slider.getValue());
                cur.setText(Double.toString(rating()));
            }
            case 4 -> {
                shopD.ratingupdate(slider.getValue());
                cur.setText(Double.toString(rating()));
            }
        }
    }

    double rating()
    {
        return switch (Feedback.shopselect) {
            case 1 -> shopA.rating;
            case 2 -> shopB.rating;
            case 3 -> shopC.rating;
            case 4 -> shopD.rating;
            default -> 0;
        };
    }
}

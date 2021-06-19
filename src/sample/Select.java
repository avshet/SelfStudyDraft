package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;

public class Select {

    @FXML
    public ChoiceBox<String> select = new ChoiceBox<>();

    @FXML
    private Button but;

    @FXML
    private void initialize(){
        select.setValue("Yes");
        select.getItems().addAll("Yes","No");
    }

    @FXML
    void pressed(ActionEvent event) throws IOException {
        LogIn m = new LogIn();
        if(select.getValue().equals("Yes")) {
            m.changeScene("AfterLogin.fxml", 575, 370);
        }
        else {
            m.changeScene("WithoutBill.fxml", 575, 370);
        }
    }

}

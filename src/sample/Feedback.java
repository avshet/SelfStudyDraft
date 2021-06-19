package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Feedback {

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    void logout(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("sample.fxml");
    }

    @FXML
    void newbill(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("select.fxml");
    }

}

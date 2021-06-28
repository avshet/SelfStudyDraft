package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewLogIn {

    LogIn m = new LogIn();
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button newAc;

    @FXML
    private Label wronglogin;

    @FXML
    private CheckBox box;

    @FXML
    private Button login;


    @FXML
    void login(ActionEvent event) throws IOException {
        if(LogIn.usern.equals(username.getText()))
            m.changeScene("sample.fxml",623, 434);
    }

    @FXML
    void createacc(ActionEvent event) {
        if(username.getText().isEmpty() && password.getText().isEmpty())
            wronglogin.setText("Enter correct details");
        else
        {
            LogIn.usern = username.getText();
            LogIn.passw = password.getText();
            System.out.println(LogIn.usern+LogIn.passw);
        }
    }

}

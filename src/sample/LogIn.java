package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;


public class LogIn extends Main {

    public LogIn() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private CheckBox box;


    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        try {
            LogIn m = new LogIn();

            if (username.getText().toString().equals("billing") && password.getText().toString().equals("123") ) {
                if(box.isSelected()) {
                    wrongLogIn.setText("Success!");
                    m.changeScene("select.fxml", 140, 160);
                }
                else
                    wrongLogIn.setText("Please select the checkBox");
            } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
                wrongLogIn.setText("Please enter your data.");
            } else {
                wrongLogIn.setText("Wrong username or password!");
            }
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }


    public void changeScene(String fxml, int breadth, int height) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.setScene(new Scene(pane,breadth,height));
        stg.getScene().setRoot(pane);
    }
}
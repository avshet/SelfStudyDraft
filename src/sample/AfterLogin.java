package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import static java.lang.Integer.parseInt;


public class AfterLogin{

    @FXML
    private Button button;

    @FXML
    private Button b1;

    @FXML
    private Label bill;

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private TextField t3;

    @FXML
    private ChoiceBox<String> choice;



    @FXML
    void billgenerate(ActionEvent event) throws Exception {
        Main m = new Main();
        try
        {
            int amount = parseInt(t1.getText());
            String mode = t2.getText();
            int tax = parseInt(t3.getText());
            bill.setText("-------Bill-------\n\nAmount\t"+amount+"\nGST   \t"+tax+"\nMODE  \t"+mode+"\n------------------\nTotal \t"+(amount+(amount*tax)/100));
        }catch (Exception e)
        {
            bill.setText("Enter correct details");
        }
    }
    @FXML
    void logout(ActionEvent event) throws IOException {
        LogIn m = new LogIn();
        m.changeScene("feedback.fxml", 600, 400);
    }

}

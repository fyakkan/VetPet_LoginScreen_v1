package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class registerVetController {

    public registerVetController(){


    }

    @FXML
    private Button vetRegisterButton;
    @FXML
    private Button vetRegisterBack;
    @FXML
    private TextField vetRegisterUsername;
    @FXML
    private PasswordField vetRegisterPassword;



    @FXML
    public void registerVet(javafx.event.ActionEvent actionEvent)throws IOException {
        userInformation userInformation = new userInformation();
        userInformation.addVet(vetRegisterUsername.toString(),vetRegisterPassword.toString());
        Main m = new Main();
        m.changeScene("vetLoginPage.fxml");
    }
    @FXML
    public void goVetLoginPage(javafx.event.ActionEvent actionEvent)throws IOException {

        Main m = new Main();
        m.changeScene("vetLoginPage.fxml");
    }
}

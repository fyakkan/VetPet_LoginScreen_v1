package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class registerPageCustomerController {


    public registerPageCustomerController(){


    }

    @FXML
    private Button customerRegisterBack;
    @FXML
    private Button customerRegisterButton;
    @FXML
    private TextField customerRegisterUsername;
    @FXML
    private PasswordField customerRegisterPassword;





    public void registerCustomer(javafx.event.ActionEvent actionEvent)throws IOException {
        userInformation userInformation = new userInformation();
        userInformation.addCustomer(customerRegisterUsername.toString(),customerRegisterPassword.toString());
        Main m = new Main();
        m.changeScene("customerLoginPage.fxml");
    }
    public void goCustomerLoginPage(javafx.event.ActionEvent actionEvent)throws IOException {
        Main m = new Main();
        m.changeScene("customerLoginPage.fxml");
    }


}

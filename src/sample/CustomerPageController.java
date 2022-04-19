package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerPageController {

    public CustomerPageController(){

    }

    @FXML
    private Button customerLoginInside;
    @FXML
    private Button customerCreateAccount;
    @FXML
    private Button customerPageBack;
    @FXML
    private Label wrongLoginCustomer;
    @FXML
    private TextField customerUserName;
    @FXML
    private PasswordField customerPassword;



    @FXML
    private void goWelcomePage(ActionEvent actionEvent) throws IOException{
        Main m = new Main();

        m.changeScene("sample.fxml");


    }
    @FXML
    private void goCreateCustomerAccountPage(ActionEvent actionEvent)throws IOException{
        Main m = new Main();
        //This part will be taken from database

        m.changeScene("registerPageCustomer.fxml");


    }
    @FXML
    public void goAfterCustomerLogin(javafx.event.ActionEvent actionEvent)throws IOException {
        checkLogin();
    }
    private void checkLogin()throws IOException{
        Main m = new Main();
        //This part will be taken from database
        if (customerUserName.getText().toString().equals("furyakk") && customerPassword.getText().toString().equals("123")) {
            wrongLoginCustomer.setText("Success!");
            m.changeScene("afterCustomerLogin.fxml");
        }
        else if (customerUserName.getText().isEmpty() || customerPassword.getText().isEmpty()) {
            wrongLoginCustomer.setText("Please enter your all information");
        }

        else {
            wrongLoginCustomer.setText("Wrong username or password! ");
        }
    }

}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class VetPageController {

    public VetPageController(){

    }

    @FXML
    private Button vetLoginInside;
    @FXML
    private Button vetCreateAccount;
    @FXML
    private Button vetPageBack;
    @FXML
    private Label wrongLoginVet;
    @FXML
    private TextField vetUserName;
    @FXML
    private PasswordField vetPassword;



    @FXML
    private void goWelcomePage(ActionEvent actionEvent) throws IOException{
        Main m = new Main();

        m.changeScene("sample.fxml");


    }
    @FXML
    private void goCreateVetAccountPage(ActionEvent actionEvent)throws IOException{
        Main m = new Main();

        // This part will be taken from database
        // In here we need a Create Customer Account page
          m.changeScene("registerPageVet.fxml");

    }
    @FXML
    private void goAfterVetLogin(javafx.event.ActionEvent actionEvent)throws IOException {
        checkLogin();
    }
    private void checkLogin()throws IOException{
        Main m = new Main();
        //This part will be taken from database
        if (vetUserName.getText().toString().equals("vet") && vetPassword.getText().toString().equals("123")) {
            wrongLoginVet.setText("Success!");
                    m.changeScene("afterVetLogin.fxml");
        }
        else if (vetUserName.getText().isEmpty() || vetPassword.getText().isEmpty()) {
            wrongLoginVet.setText("Please enter your all information");
        }

        else {
            wrongLoginVet.setText("Wrong username or password! ");
        }
    }


}

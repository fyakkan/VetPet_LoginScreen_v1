package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class afterVetLoginController {

    public afterVetLoginController(){

    }

    @FXML
    private Button afterVetLoginLogout;



    @FXML
    private void goWelcomePage()throws IOException{
        Main m = new Main();
        //This part will be taken from database

        m.changeScene("sample.fxml");


    }

}

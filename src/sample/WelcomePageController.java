package sample;

        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.PasswordField;
        import javafx.scene.control.TextField;

        import java.awt.event.ActionEvent;
        import java.io.IOException;

public class WelcomePageController {

    public WelcomePageController(){

    }

    @FXML
    private Button customerLoginButton;
    @FXML
    private Button vetLoginButton;


    @FXML
    private void customerLoginPage()throws IOException{
        Main m = new Main();
        //This part will be taken from database

            m.changeScene("customerLoginPage.fxml");


    }
    @FXML
    private void vetLoginPage()throws IOException{
        Main m = new Main();
        //This part will be taken from database

        m.changeScene("vetLoginPage.fxml");


    }

}

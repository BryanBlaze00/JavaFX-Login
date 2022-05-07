package com.example.javafx;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class MyLoginController {
    @FXML
    public  PasswordField password;
    @FXML
    public  Label  title;
    @FXML
    private Label submission;

    @FXML
    protected void whenClicked( ) {
        submission.setText("Submitted!");
    }
}
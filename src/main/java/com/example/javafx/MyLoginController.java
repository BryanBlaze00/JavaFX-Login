package com.example.javafx;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public  PasswordField password;
    @FXML
    private Text          submission;

    @FXML
    protected void whenClicked( ) {
        submission.setText("Submitted!");
    }
}
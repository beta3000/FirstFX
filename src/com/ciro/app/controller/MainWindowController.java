package com.ciro.app.controller;


import com.ciro.app.Main;
import com.ciro.app.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

    private Main main;
    //Views
    @FXML
    private Label label;
    @FXML
    private TextField field;

    private Person person;

    public void setMain(Main main){
        this.main = main;
        person = new Person("Charly","Brown","25");
    }

    public void handleButton(){
        String text = field.getText();
        person.setFirstName(text);
        label.setText(person.getFirstName());
        field.clear();
    }
}

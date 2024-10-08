package com.example.week6_figmatocode;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TableView<?> tableView;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField departmentField;
    @FXML
    private TextField majorField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField imageURLField;

    @FXML
    protected void handleClear() {

        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
        imageURLField.clear();
    }

    @FXML
    protected void handleAdd() {

    }

    @FXML
    protected void handleDelete() {

    }

    @FXML
    protected void handleEdit() {

    }
}
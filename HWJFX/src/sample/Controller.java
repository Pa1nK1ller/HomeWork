package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Random;

public class Controller {

    @FXML
    private Label randomNum;

    @FXML
    private TextField numberInput;

    public void initialize() {

    }

    @FXML
    void doRandomAction() {
        Random random = new Random();

        String message = numberInput.getText();
        numberInput.clear();
        if (!message.isBlank()) {
            try {
                int num = Integer.parseInt(message);
                int randomNumber = random.nextInt(num + 1);
                randomNum.setText(String.valueOf(randomNumber));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.ERROR,"Введите число").show();
            }
        }
    }

}

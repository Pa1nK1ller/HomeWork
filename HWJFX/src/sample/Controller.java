package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Random;

public class Controller {
    int count = 3;
    int guess = -1;
    int number;
    @FXML
    private Label message;
    @FXML
    private TextField checkNumber;

    public void initialize() {
        Random rnd = new Random();
        number = rnd.nextInt(10);
        restartButton.setVisible(false);
        message.setVisible(true);
        checkNumber.setVisible(true);
        button.setVisible(true);
        count = 3;
        message.setText("Я Загадал число от 1 до 9 попробуй угадать");
        exit.setVisible(false);

    }

    @FXML
    void checkAnswer() {
        try {
            guess = Integer.parseInt(checkNumber.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            var alert = new Alert(Alert.AlertType.ERROR, "Ошибка ввода данных\nВ следующий раз думай, что вводишь! :)");
            alert.setTitle("Ошибка ввода данных");
            alert.show();
        }
        checkNumber.clear();
        if (guess == number) {
            message.setText("Вы Угадали");
            restartButton.setVisible(true);
            checkNumber.setVisible(false);
            button.setVisible(false);
            exit.setVisible(true);
        } else {
            count--;
            message.setText(guess + ((guess > number) ? " Больше" : " Меньше") + " загаданной цифры\n" +
                    "Количество оставшихся попыток:" + count);
        }
        if (count == 0) {
            message.setText("Вы проиграли");
            restartButton.setVisible(true);
            checkNumber.setVisible(false);
            button.setVisible(false);
            exit.setVisible(true);
        }
    }

    @FXML
    private Button restartButton;
    @FXML
    private Button button;
    @FXML
    private Button exit;

    @FXML
    void restartGame() {
        initialize();
    }

    @FXML
    void exit() {
        System.exit(-1);
    }
}

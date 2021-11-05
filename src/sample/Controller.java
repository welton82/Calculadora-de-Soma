package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Label lblResult;

    @FXML
    private Button btnSum;

    @FXML
    private Button btn;

    //MÉTODO PARA CRIAR EVENTO DE SOMA NO BOTÃO
    @FXML
    public void onBtnSumAction(){
        try{

            Double n1 = Double.parseDouble(txtNumber1.getText());
            Double n2 = Double.parseDouble(txtNumber2.getText());
            Double sun = n1+n2;
            lblResult.setText(String.format("%.2f",sun));
        }catch(NumberFormatException e){
            Alerts.showAlerts("Error","Parse Error",e.getMessage(), Alert.AlertType.ERROR);
        }
    }

}

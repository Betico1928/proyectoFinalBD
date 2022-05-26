package co.edu.javeriana.proyectofinalbd;

import co.edu.javeriana.proyectofinalbd.utils.Oracle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControladorInterfaceLogin
{
    @FXML
    private Button botonConectarse;

    @FXML
    private Label welcomeText;

    @FXML
    void presionarBotonConectarse(ActionEvent event)
    {
        Oracle.conectar();
    }
}

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
    private Label textoProbarConexion;


    @FXML
    private Label welcomeText;

    @FXML
    void presionarBotonConectarse(ActionEvent event)
    {
        boolean result = false;
        result = Oracle.conectar();

        if (result)
        {
            textoProbarConexion.setText("Se logró conectar la base de datos :D");
        }
        else
        {
            textoProbarConexion.setText("No se logró conectar la base de datos D:");
        }
    }
}

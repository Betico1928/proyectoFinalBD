package co.edu.javeriana.proyectofinalbd;

import co.edu.javeriana.proyectofinalbd.model.DAO.Impl.LogInDAOImpl;
import co.edu.javeriana.proyectofinalbd.model.DAO.LogInDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorInterfaceLogin
{
    @FXML
    private Button botonConectarse;

    @FXML
    private TextField textUsuario;

    @FXML
    private TextField textContrasena;

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

    @FXML
    void presionarLogIn(ActionEvent event)
    {

        String usuario = textUsuario.getText();
        String password = textContrasena.getText();

        LogInDTO p1 = new LogInDTO(usuario, password);
        LogInDAO uDAO = new LogInDAOImpl();
        LogInDTO persona = uDAO.create(p1);

    }




}

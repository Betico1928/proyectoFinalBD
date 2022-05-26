package co.edu.javeriana.proyectofinalbd;

import co.edu.javeriana.proyectofinalbd.model.DAO.Impl.LogInDAOImpl;
import co.edu.javeriana.proyectofinalbd.model.DAO.LogInDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;
import com.sun.javafx.charts.Legend;
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
    private Button botonRegistrarse;

    @FXML
    private Button botonLogIn;

    @FXML
    private TextField textUsuario;

    @FXML
    private TextField textContrasena;

    @FXML
    public Label textoProbarConexion;


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
    void presionarRegistrarse(ActionEvent event)
    {

        String usuario = textUsuario.getText();
        String password = textContrasena.getText();

        LogInDTO pRegistrar = new LogInDTO(usuario, password);
        LogInDAO uDAO = new LogInDAOImpl();
        LogInDTO persona = uDAO.create(pRegistrar);
    }

    @FXML
    void presionarBotonLogIn(ActionEvent event)
    {
        String usuario = textUsuario.getText();
        String password = textContrasena.getText();

        LogInDTO pLogIn = new LogInDTO(usuario, password);
        LogInDAO uDAO = new LogInDAOImpl();
        LogInDTO persona = uDAO.create(pLogIn);
    }
}

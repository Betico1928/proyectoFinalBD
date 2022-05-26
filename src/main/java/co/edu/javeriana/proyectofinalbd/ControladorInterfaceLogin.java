package co.edu.javeriana.proyectofinalbd;

import co.edu.javeriana.proyectofinalbd.model.DAO.Impl.LogInDAOImpl;
import co.edu.javeriana.proyectofinalbd.model.DAO.LogInDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;
import com.sun.javafx.charts.Legend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    // Para cambiar de Scene
    private Stage stage;
    private Scene scene;
    private Parent root;


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
        LogInDTO persona = uDAO.findByID(pLogIn);
    }




    // Scene hotel
    public void cambiarASceneHotel()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("interfazHotel.fxml"));
    }

    // Scene Empleados
    public void cambiarASceneEmpleados()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(mainApplication.class.getResource("interfazEmpleados.fxml"));
    }

    //Scene
}

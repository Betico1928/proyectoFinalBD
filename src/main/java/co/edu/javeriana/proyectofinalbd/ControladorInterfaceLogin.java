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
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ControladorInterfaceLogin
{
    // Interfaz LogIn
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

    // Interfaz Hotel
    @FXML
    private ToggleGroup clasificacion;
    @FXML
    private Button crearHotel;
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio4;
    @FXML
    private RadioButton radio5;
    @FXML
    private TextField textoConsumo;
    @FXML
    private TextField textoDNIhotel;
    @FXML
    private TextField textoDepartamento;
    @FXML
    private TextField textoDireccion;
    @FXML
    private TextField textoHotelID;
    @FXML
    private TextField textoIVA;
    @FXML
    private TextField textoNombreHotel;
    @FXML
    private TextField textoPais;
    @FXML
    private TextField textoRegistroOperacion;
    @FXML
    private TextField textoTelefono;
    @FXML
    private TextField textoTurismo;


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

    // Interfaz Hotel
    @FXML
    int seleccionarClasificacion(ActionEvent event)
    {
        int Seleccion = 0;
        if (radio1.isSelected())
        {
            Seleccion = 1;
        }
        else if (radio2.isSelected())
        {
           Seleccion = 2;
        } else if (radio3.isSelected())
        {
            Seleccion = 3;
        }
        else if (radio4.isSelected())
        {
            Seleccion = 4;
        }
        else if (radio5.isSelected())
        {
            Seleccion = 5;
        }
        return Seleccion;
    }


    @FXML
    void crearHotel(ActionEvent event)
    {
        
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
}

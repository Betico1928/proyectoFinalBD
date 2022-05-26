package co.edu.javeriana.proyectofinalbd.model.DAO.Impl;

import co.edu.javeriana.proyectofinalbd.ControladorInterfaceLogin;
import co.edu.javeriana.proyectofinalbd.model.DAO.LogInDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInDAOImpl implements LogInDAO
{
    private final Oracle oracle;

    public LogInDAOImpl()
    {
        this.oracle = new Oracle();
    }

    @Override
    public LogInDTO create(LogInDTO logIn)
    {
        try
        {
            this.oracle.conectar();
            String query = "INSERT INTO log_in(usuarioLogIn,constrasenaLogIn) VALUES ('" + logIn.getUsuario() + "','" + logIn.getContraseña() + "')";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code)
            {
                case 1:
                    System.out.println("Se creo la persona");
                    //JOptionPane.showMessageDialog(null, "Se creo la persona");
                    return findByID(logIn.getUsuario());
                default:
                    return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LogInDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error, tal vez no estas registrado. Intentalo nuevamente");
            //JOptionPane.showMessageDialog(null, "Error, tal vez no estas registrado. Intentalo nuevamente");
            return null;
        }
    }

    @Override
    public Boolean findByID(LogInDTO logIn)
    {
        Boolean result = false;
        try {
            this.oracle.conectar();
            String query = "SELECT * FROM log_in WHERE UsuarioLogIn = '" + logIn.getUsuario() + "'";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("TE AMO 1");
            if (rs.first()) {
                LogInDTO persona = new LogInDTO(
                        rs.getString("usuarioLogIn"),
                        rs.getString("constrasenaLogIn"));
                rs.close();
                stmt.close();
                System.out.println("TE AMO 2");
                if (logIn.equals(persona))
                {
                    result = true;
                }
            }
            else
            {
                rs.close();
                stmt.close();
                return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LogInDAOImpl.class.getName()).log(Level.SEVERE, "Hubo una excepcion jajaja", ex);
            return null;
        }
        return result;
    }


    // Para el crear usuario
    public LogInDTO findByID(String usuario)
    {
        return null;
    }
}

package co.edu.javeriana.proyectofinalbd.model.DAO.Impl;

import co.edu.javeriana.proyectofinalbd.model.DAO.HotelDAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HotelDAOImpl implements HotelDAO
{

    @Override
    public HotelDAO create(HotelDAO hotelDAO)
    {
        System.out.println("Hola");
        /*
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
        */
        return null;
    }

    @Override
    public HotelDAO buscarHotel(HotelDAO hotel)
    {
        return null;
    }
}

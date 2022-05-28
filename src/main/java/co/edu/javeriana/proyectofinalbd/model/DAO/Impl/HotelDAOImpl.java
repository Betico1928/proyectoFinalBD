package co.edu.javeriana.proyectofinalbd.model.DAO.Impl;

import co.edu.javeriana.proyectofinalbd.model.DAO.HotelDAO;
import co.edu.javeriana.proyectofinalbd.model.DTO.HotelDTO;
import co.edu.javeriana.proyectofinalbd.model.DTO.LogInDTO;
import co.edu.javeriana.proyectofinalbd.utils.Oracle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HotelDAOImpl implements HotelDAO
{
    private final Oracle oracle;

    public HotelDAOImpl()
    {
        this.oracle = new Oracle();
    }

    @Override
    public HotelDTO create(HotelDTO hotelDTO)
    {
        System.out.println("Entrada al create");
        try
        {
            this.oracle.conectar();
            String query = "INSERT INTO hotel(nombre_Hotel, direccion_hotel, telefono_hotel, anio_construccion, registro_operacion, DNI, Clasificacion_estrellas, departamentos, hotel_ID, pais,IVA, impuesto_consumo, impuesto_turismo ) VALUES ('" + hotelDTO.getNombre_hotel() + "','" + hotelDTO.getDireccion_hotel() + "','" + hotelDTO.getTelefono_hotel() +"','" + "2022" +"','" + hotelDTO.getRegistro_operacion() + "','" + hotelDTO.getDNI() +"','" + hotelDTO.getClasificacion_estrellas() +"','" + hotelDTO.getDepartamentos() +"','" + hotelDTO.getHotel_id() +"','" + hotelDTO.getPais() +"','" + hotelDTO.getIVA() + "','" + hotelDTO.getImpuesto_consumo() +"','" + hotelDTO.getImpuesto_Turismo() + "')";
            //, , , , , , , , , , , ,
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code)
            {
                case 1:
                    System.out.println("Se creo el hotel");
                    //JOptionPane.showMessageDialog(null, "Se creo el hotel");
                    return buscarHotel(hotelDTO.getNombre_hotel());
                default:
                    return null;
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(LogInDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error, no se pudo registrar el hotel. Intentalo nuevamente");
            //JOptionPane.showMessageDialog(null, "Error, no se pudo registrar el hotel. Intentalo nuevamente");
            return null;
        }
    }

    @Override
    public HotelDTO buscarHotel(String hotel_ID)
    {
        System.out.println("Buscar un hotel con ID");
        /*
        try {
            this.oracle.conectar();
            String query = "SELECT * FROM log_in WHERE  hotel_ID = '" + hotel_ID + "'";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Primera entreada?");
            if (rs.first()) {
                HotelDTO hotel = new HotelDTO
                        (
                        rs.getString("nombre_hotel"),
                        rs.getString("direccion_hotel"),
                        rs.getString("telefono_hotel"),
                        rs.getString("anio_construccion"),
                        rs.getString("registro_operacion"),
                        rs.getString("DNI"),
                        rs.getString("Clasificacion_estrellas"),
                        rs.getString("gerente"),
                        rs.getString("departamentos"),
                        rs.getString("hotel_ID"),
                        rs.getString("fecha_actualizacion"),
                        rs.getString("pais"),
                        rs.getString("IVA"),
                        rs.getString("impuesto_consumo"),
                        rs.getString("impuesto_turismo")
                        );
                rs.close();
                stmt.close();
                System.out.println("Segunda Entrada?");
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
        //return hotel_ID;
         */
        return null;
    }
}
